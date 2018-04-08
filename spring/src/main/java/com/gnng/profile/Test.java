package com.gnng.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		//讲活动的profile设置为prod
		context.getEnvironment().setActiveProfiles("prod");
		//context.getEnvironment().setActiveProfiles("dev");
		
		//后置注册Bean配置，不然会报Bean未定义错误
		context.register(ProfileConfig.class);
		
		//刷新容器
		context.refresh();
		
		DemoBean demoBean = context.getBean(DemoBean.class);
		
		System.out.println(demoBean.getContent());
		
		context.close();
	}

}
