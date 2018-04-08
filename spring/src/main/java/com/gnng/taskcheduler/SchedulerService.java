package com.gnng.taskcheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	//@Scheduled�����÷����Ǽƻ�����ʹ��fixedRate����ÿ���̶�ʱ�䣨ms��ִ��
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime(){
		System.out.println("ÿ��5����ִ��һ��"+dateFormat.format(new Date()));
	}
	
	@Scheduled(cron = "0 16 17 ? * *")
	public void fixTimeExecution(){
		System.out.println("��ָ��ʱ�� "+dateFormat.format(new Date())+"ִ��");
	}
		
}
