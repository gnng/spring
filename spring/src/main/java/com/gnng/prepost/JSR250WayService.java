package com.gnng.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
	
	@PostConstruct  //在构造函数执行完之后执行
	public void init(){
		System.out.println("@jsr250-init-method");
	}
	
	public JSR250WayService(){
		super();
		System.out.println("jsr250构造函数");
	}
	
	@PreDestroy  //在Bean销毁之前执行
	public void destory(){
		System.out.println("@jsr250-destory-method");
	}

}
