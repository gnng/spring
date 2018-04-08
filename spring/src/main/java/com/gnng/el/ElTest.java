package com.gnng.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ElTest {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
		
		DemoElService demoElService = context.getBean(DemoElService.class);
		
		demoElService.outputResource();
		context.close();
	}

}
