package com.gnng.prepost;

public class BeanWayService {
	
	public void init(){
		System.out.println("@Bean-init-method");
	}
	
	public BeanWayService(){
		super();
		System.out.println("��ʼ�����캯��-BeanWayService");
	}
	
	public void destory(){
		System.out.println("@Bean-init-method");
	}
}
