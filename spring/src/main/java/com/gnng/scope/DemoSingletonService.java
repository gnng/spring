package com.gnng.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
//默认singleton（单例）
public class DemoSingletonService {

	
	@Value("其他类的属性")
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
