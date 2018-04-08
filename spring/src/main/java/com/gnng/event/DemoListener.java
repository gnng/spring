package com.gnng.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
//ʵ��ApplicationListener�ӿڣ���ָ�������¼�����
public class DemoListener implements ApplicationListener<DemoEvent>{

	@Override
	//ʹ��onApplicationEvent��������Ϣ���н��մ���
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		
		System.out.println("��(bean-demolistener)���յ���bean-demoPublisher��������Ϣ��"+msg);
	}
	
	

}
