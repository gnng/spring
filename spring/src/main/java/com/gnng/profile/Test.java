package com.gnng.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		//�����profile����Ϊprod
		context.getEnvironment().setActiveProfiles("prod");
		//context.getEnvironment().setActiveProfiles("dev");
		
		//����ע��Bean���ã���Ȼ�ᱨBeanδ�������
		context.register(ProfileConfig.class);
		
		//ˢ������
		context.refresh();
		
		DemoBean demoBean = context.getBean(DemoBean.class);
		
		System.out.println(demoBean.getContent());
		
		context.close();
	}

}
