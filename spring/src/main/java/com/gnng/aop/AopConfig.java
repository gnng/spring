package com.gnng.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.gnng.aop")
@EnableAspectJAutoProxy  //开启spring对AspectJ代理的支持
public class AopConfig {

	
}
