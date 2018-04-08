package com.gnng.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
	
	@Bean
	@Profile("dev") //为dev时实例化devDemoBean
	public DemoBean devDemoBean(){
		return new DemoBean("from developent profile");
	}
	
	@Bean
	@Profile("prod")
	public DemoBean prodDemoBean(){
		return new DemoBean("from production profile");
	}

}
