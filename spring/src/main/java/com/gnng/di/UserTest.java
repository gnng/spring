package com.gnng.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {
	
	public static void main(String[] args) {
		//注册实体Bean,spring容器
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		//获取实体Bean
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService.sayHello("gnng"));
		//关闭连接
		context.close();
	}

}
