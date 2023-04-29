package com.pangmin.usercenter.exception;


import com.pangmin.usercenter.common.BaseResponse;
import com.pangmin.usercenter.common.ErrorCode;
import com.pangmin.usercenter.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse businessExceptionHandler(BusinessException e) {
        log.error("businessException " + e.getMessage(), e);
        return ResultUtils.error(e.getCode(), e.getMessage(), e.getDescription());
    }


    @ExceptionHandler(RuntimeException.class)
    public BaseResponse runtimeException(RuntimeException e) {
        log.error("runtimeException: ", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, e.getMessage(), "");
    }
}
