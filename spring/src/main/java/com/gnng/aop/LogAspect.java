package com.gnng.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect  //��������
@Component	//�ô������Ϊspring���������Bean
public class LogAspect {
	
	//�����е�
	@Pointcut("@annotation(com.gnng.aop.Action)")
	public void annotationPointCut(){};
	
	//ͨ��@Afterע������һ������,��ʹ��@Pointcut������е�
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("ע��ʽ���أ�"+action.name());
	}
	
	//����ʽ����
	@Before("execution(* com.gnng.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("��������ʽ���أ�"+method.getName());
	}
	
	

}
