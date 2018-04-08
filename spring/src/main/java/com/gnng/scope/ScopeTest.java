package com.gnng.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {
	
	public static void main(String[] args) {
		
		//����spring����������������
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		
		//����ʵ��
		DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
		
		//ʵ������������
		DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
		DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
		
		System.out.println("p1��p2�Ƿ���ȣ�"+p1.equals(p2));
		System.out.println("s1��s2�Ƿ���ȣ�"+s1.equals(s2));
		
		context.close();
	}

}
