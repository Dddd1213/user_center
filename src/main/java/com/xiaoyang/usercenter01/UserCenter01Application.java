package com.xiaoyang.usercenter01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiaoyang.usercenter01.mapper")
public class UserCenter01Application {

	public static void main(String[] args) {
		SpringApplication.run(UserCenter01Application.class, args);
	}

}
