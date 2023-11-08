package com.xiaoyang.usercenter01.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户名

     */
    private String username;

    /**
     * 
     */
    private String userAccount;

    /**
     * 用户头像

     */
    private String avatarUrl;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 
     */
    private String userPassword;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱

     */
    private String email;

    /**
     * 状态
0 - 正常
     */
    private Integer userStatus;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 
     */
    @TableLogic
    private Integer isDelete;

    /**
     * 0 - 普通用户
1 - 管理员
     */
    private Integer userRole;

    /**
     * 星球编号
     */
    private String planetCode;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}