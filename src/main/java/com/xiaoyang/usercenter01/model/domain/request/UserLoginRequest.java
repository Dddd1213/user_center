package com.xiaoyang.usercenter01.model.domain.request;

import lombok.Data;

/**
 * 用户登录请求体
 *
 */
@Data
public class UserLoginRequest {
    private static final long serialVersionUID = -1819970642108244965L;

    private String userAccount;
    private String userPassword;

}
