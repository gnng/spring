package com.gnng.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
//Ĭ��singleton��������
public class DemoSingletonService {

	
	@Value("�����������")
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
