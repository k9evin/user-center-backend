package com.pangmin.usercenter.common;

/**
 * 基础返回工具类
 */
public class ResultUtils {

    /**
     * 成功
     *
     * @param data 返回数据
     * @param <T>  返回数据类型
     * @return BaseResponse 返回结果
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "success");
    }

    /**
     * 失败
     *
     * @param errorCode 错误码
     * @param <T>       返回数据类型
     * @return BaseResponse 返回结果
     */
    public static <T> BaseResponse<T> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }
}
