package com.gnng.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
//实现ApplicationListener接口，并指定监听事件类型
public class DemoListener implements ApplicationListener<DemoEvent>{

	@Override
	//使用onApplicationEvent方法对消息进行接收处理
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		
		System.out.println("我(bean-demolistener)接收到了bean-demoPublisher发布的消息："+msg);
	}
	
	

}
