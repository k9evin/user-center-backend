package com.pangmin.usercenter.service;

import com.pangmin.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author pangmin
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2023-04-20 23:05:14
 */
public interface UserService extends IService<User> {


    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 教研密码
     * @param netId         用户编号
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String netId);

    /**
     * 用户登陆
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request      请求
     * @return 返回脱敏的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 用户脱敏
     *
     * @param user 原始用户信息
     * @return 脱敏后的用户信息
     */
    User getSafetyUser(User user);

    /**
     * 用户登出
     *
     * @param request 请求
     * @return 1 成功 0 失败
     */
    int userLogout(HttpServletRequest request);
}
