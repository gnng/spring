package com.gnng.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

	//@Asyncע������÷������첽���������ע�����༶�����ʾ�������еķ��������첽������������ķ����Զ���ע��ʹ��ThreadPoolTaskExecutor��ΪTaskExecutor
	@Async
	public void executeAsyncTask(Integer i){
		System.out.println("ִ���첽����"+i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i){
		System.out.println("ִ���첽����+1��"+i);
	}
}
