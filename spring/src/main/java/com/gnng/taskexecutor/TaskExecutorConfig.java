package com.gnng.taskexecutor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * ������ʵ��AsyncConfigurer�ӿڣ���дgetAsyncExecutor()������
 * ������ThreadPoolTaskExecutor,�������Ǿͻ�ȡ��һ�������̳߳ص�TaskExecutor
 * @author gnng
 *
 */
@Configuration
@ComponentScan("com.gnng.taskexecutor")
@EnableAsync	//�����첽����֧��
public class TaskExecutorConfig implements AsyncConfigurer{

	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);//corePoolSize�̳߳صĻ�����С��û��������Ҫִ�е�ʱ���̳߳ش�С
		taskExecutor.setMaxPoolSize(10);//MaxPoolSize�̳߳����������߳���
		taskExecutor.setQueueCapacity(25);//������󳤶�
		taskExecutor.initialize();//�̳߳�ʼ��
		return taskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}

}
