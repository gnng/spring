package com.gnng.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
	
	@Action(name = "ע��ʽ���ص�add����")
	public void add(){}

}
