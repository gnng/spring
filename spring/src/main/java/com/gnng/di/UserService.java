package com.gnng.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private FunctionService functionService;
	
	public String sayHello(String word){
		return functionService.sayHello(word);
	}
	
}
