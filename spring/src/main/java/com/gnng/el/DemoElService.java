package com.gnng.el;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:test.properties")
public class DemoElService {
	
	@Value("其他类属性")  //注入普通字符串
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Value("离开你才发现我有爱过你")//注入普通字符串
	private String normal;//正常的
	
	@Value("#{systemProperties[os.name]}")//注入操作系统熟悉
	private String osName;
	
	@Value("#{T(java.lang.Math).random()*100.0}")//注入表达式结果
	private double randomNumber;
	
	@Value("#{DemoElService.username}")//注入其他
	private String formAnother;

	@Value("classpath:test.txt")//注入文件资源
	private Resource testFile;
	
	@Value("http://www.baidu.com")//注入网址资源
	private Resource testUrl;
	
	@Value("${username}")//注入配置文件
	private String userName;
	
	@Autowired
	private Environment environment;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	public void outputResource(){
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(formAnother);
			System.out.println(testFile);
			System.out.println(testUrl);
			System.out.println(userName);
			System.out.println(environment.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
	

}
