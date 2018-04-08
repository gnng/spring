package com.gnng.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.gnng.prepost")
public class PrepostConfig {
	
	//initMethod,destroyMethod��ʾָ��BeanWayService����init��destory�����ڹ���֮��Bean����֮ǰִ��
	@Bean(initMethod="init",destroyMethod="destory") 
	BeanWayService beanWayService(){
		return new BeanWayService();
	}
	
	@Bean
	JSR250WayService jsr250WayService(){
		return new JSR250WayService();
	}
}
