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
	
	@Value("����������")  //ע����ͨ�ַ���
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Value("�뿪��ŷ������а�����")//ע����ͨ�ַ���
	private String normal;//������
	
	@Value("#{systemProperties[os.name]}")//ע�����ϵͳ��Ϥ
	private String osName;
	
	@Value("#{T(java.lang.Math).random()*100.0}")//ע����ʽ���
	private double randomNumber;
	
	@Value("#{DemoElService.username}")//ע������
	private String formAnother;

	@Value("classpath:test.txt")//ע���ļ���Դ
	private Resource testFile;
	
	@Value("http://www.baidu.com")//ע����ַ��Դ
	private Resource testUrl;
	
	@Value("${username}")//ע�������ļ�
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
