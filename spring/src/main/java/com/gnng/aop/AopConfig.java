package com.gnng.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.gnng.aop")
@EnableAspectJAutoProxy  //����spring��AspectJ�����֧��
public class AopConfig {

	
}
