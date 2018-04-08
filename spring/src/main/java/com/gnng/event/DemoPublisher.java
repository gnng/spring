package com.gnng.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
	
	@Autowired
	//注入ApplicationContext用来发布事件
	private ApplicationContext applicationContext;
	
	public void publish(String msg){
		//使用ApplicationContext的publishEvent方法来发布
		applicationContext.publishEvent(new DemoEvent(this,msg));
	}

}
