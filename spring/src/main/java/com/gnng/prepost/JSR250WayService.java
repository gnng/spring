package com.gnng.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
	
	@PostConstruct  //�ڹ��캯��ִ����֮��ִ��
	public void init(){
		System.out.println("@jsr250-init-method");
	}
	
	public JSR250WayService(){
		super();
		System.out.println("jsr250���캯��");
	}
	
	@PreDestroy  //��Bean����֮ǰִ��
	public void destory(){
		System.out.println("@jsr250-destory-method");
	}

}
