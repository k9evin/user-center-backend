package com.pangmin.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登陆请求体
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = 18611813994751215L;

    private String userAccount;

    private String userPassword;
}