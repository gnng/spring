package com.gnng.taskcheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	//@Scheduled声明该方法是计划任务，使用fixedRate属性每隔固定时间（ms）执行
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime(){
		System.out.println("每隔5秒钟执行一次"+dateFormat.format(new Date()));
	}
	
	@Scheduled(cron = "0 16 17 ? * *")
	public void fixTimeExecution(){
		System.out.println("在指定时间 "+dateFormat.format(new Date())+"执行");
	}
		
}
