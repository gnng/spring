package com.gnng.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {
	
	public static void main(String[] args) {
		//ע��ʵ��Bean,spring����
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		//��ȡʵ��Bean
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService.sayHello("gnng"));
		//�ر�����
		context.close();
	}

}
