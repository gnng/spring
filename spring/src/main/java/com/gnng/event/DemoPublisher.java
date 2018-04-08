package com.gnng.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
	
	@Autowired
	//ע��ApplicationContext���������¼�
	private ApplicationContext applicationContext;
	
	public void publish(String msg){
		//ʹ��ApplicationContext��publishEvent����������
		applicationContext.publishEvent(new DemoEvent(this,msg));
	}

}
