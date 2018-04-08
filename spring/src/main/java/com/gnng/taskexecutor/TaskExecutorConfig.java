package com.gnng.taskexecutor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * 配置类实现AsyncConfigurer接口，重写getAsyncExecutor()方法，
 * 并返回ThreadPoolTaskExecutor,这样我们就获取了一个基于线程池的TaskExecutor
 * @author gnng
 *
 */
@Configuration
@ComponentScan("com.gnng.taskexecutor")
@EnableAsync	//开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer{

	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);//corePoolSize线程池的基本大小，没有任务需要执行的时候线程池大小
		taskExecutor.setMaxPoolSize(10);//MaxPoolSize线程池允许的最大线程数
		taskExecutor.setQueueCapacity(25);//队列最大长度
		taskExecutor.initialize();//线程初始化
		return taskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}

}
