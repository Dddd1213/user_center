package com.xiaoyang.usercenter01.service;

import com.xiaoyang.usercenter01.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author xiaoyang
* @description 针对表【user(用户)】的数据库操作Service
*/
public interface UserService extends IService<User> {


    /**
     *用户注册
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @Param planetCode
     * @return 新用户id
     */

    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);


    /**
     * 用户登录
     * @param userAccount
     * @param userPassword
     * @param request
     * @return 返回脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     *用户脱敏
     *
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @return
     */
    int userLogout(HttpServletRequest request);
}
