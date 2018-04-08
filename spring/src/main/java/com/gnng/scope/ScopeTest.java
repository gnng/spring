package com.gnng.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {
	
	public static void main(String[] args) {
		
		//创建spring容器，加在配置类
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		
		//创建实例
		DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
		
		//实例化单例对象
		DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
		DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
		
		System.out.println("p1与p2是否相等："+p1.equals(p2));
		System.out.println("s1与s2是否相等："+s1.equals(s2));
		
		context.close();
	}

}
