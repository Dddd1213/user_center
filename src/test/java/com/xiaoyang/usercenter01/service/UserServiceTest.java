package com.xiaoyang.usercenter01.service;

import com.xiaoyang.usercenter01.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 用户服务测试
 *
 * @author xiaoyang
 */

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void testAddUser(){

        User user = new User();
        user.setUsername("Xiaoyang");
        user.setUserAccount("12345");
        user.setAvatarUrl("https://img-home.csdnimg.cn/images/20201124032511.png");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("456");
        user.setUserStatus(0);
        user.setIsDelete(0);

        boolean result = userService.save(user);
        System.out.println(user.getId());
        assertTrue(result);
        
    }

    @Test
    void userRegister() {
        String ua = "abcde";
        String up = "12345678";
        String cp = "12345678";
        String pc = "111";
        long result;

        ua = "x";
        result = userService.userRegister(ua, up, cp, pc);
        Assertions.assertEquals(-1,result);
        ua = "123";
        result = userService.userRegister(ua, up, cp, pc);
        Assertions.assertEquals(-1,result);
        ua = "ab cd";
        result = userService.userRegister(ua, up, cp, pc);
        Assertions.assertEquals(-1,result);
        up = "1234";
        result = userService.userRegister(ua, up, cp, pc);
        Assertions.assertEquals(-1,result);
        up = "12345678";
        cp = "123456789";
        result = userService.userRegister(ua, up, cp, pc);
        Assertions.assertEquals(-1,result);
        ua = "abcdef";
        up = "12345678";
        cp = "12345678";
        System.out.println(ua);
        result = userService.userRegister(ua, up, cp, pc);
        Assertions.assertTrue(result>0);

    }
}