package com.pangmin.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = 18611813994751215L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String netId;
}
