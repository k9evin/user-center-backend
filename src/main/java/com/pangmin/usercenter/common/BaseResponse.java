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

    /**
     * 创建一个新的 BaseResponse 实例.
     *
     * @param code        状态码
     * @param data        返回数据
     * @param message     状态码信息
     * @param description 状态码描述
     */
    public BaseResponse(int code, T data, String message, String description) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.description = description;
    }

    /**
     * 创建一个新的 BaseResponse 实例.
     *
     * @param code    状态码
     * @param data    返回数据
     * @param message 状态码信息
     */
    public BaseResponse(int code, T data, String message) {
        this(code, data, message, "");
    }


    /**
     * 创建一个新的 BaseResponse 实例.
     *
     * @param errorCode 错误码
     */
    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage(), errorCode.getDescription());
    }
}
