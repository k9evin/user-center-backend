package com.pangmin.usercenter.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 基础返回类
 *
 * @param <T> 返回数据类型
 */
@Data
public class BaseResponse<T> implements Serializable {
    private int code;

    private String message;

    private T data;

    private String description;

    public BaseResponse(int code, T data, String message, String description) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.description = description;
    }

    public BaseResponse(int code, T data, String message) {
        this(code, data, message, "");
    }

    public BaseResponse(int code, T data) {
        this(code, data, "", "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage(), errorCode.getDescription());
    }
}
