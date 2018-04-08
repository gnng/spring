package com.gnng.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //������ǰ��Ϊע���࣬����û�н��а�ɨ�裬���е�ע���඼�ڸ����ж���
public class JavaConfig {
	
	@Bean
	public FunctionService functionService(){
		return new FunctionService();
	}
	
	/**
	 * �޲�ע��
	 * @return
	 */
	@Bean
	public UseFunctionService useFunctionService(){
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}
	
	/**
	 * �в�ע��
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
