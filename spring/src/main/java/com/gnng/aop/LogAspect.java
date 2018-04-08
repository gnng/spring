package com.gnng.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect  //声明切面
@Component	//让此切面成为spring容器管理的Bean
public class LogAspect {
	
	//声明切点
	@Pointcut("@annotation(com.gnng.aop.Action)")
	public void annotationPointCut(){};
	
	//通过@After注解声明一个建言,并使用@Pointcut定义的切点
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截："+action.name());
	}
	
	//方法式拦截
	@Before("execution(* com.gnng.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则式拦截："+method.getName());
	}
	
	

}
