package com.gnng.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //表明当前类为注解类，这里没有进行包扫描，所有的注入类都在该类中定义
public class JavaConfig {
	
	@Bean
	public FunctionService functionService(){
		return new FunctionService();
	}
	
	/**
	 * 无参注入
	 * @return
	 */
	@Bean
	public UseFunctionService useFunctionService(){
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}
	
	/**
	 * 有参注入
	 * @param functionService
	 * @return
	 */
	@Bean
	public UseFunctionService useFunctionService(FunctionService functionService){
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService);
		return useFunctionService;
	}
}
