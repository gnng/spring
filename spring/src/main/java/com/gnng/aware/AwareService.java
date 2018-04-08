package com.gnng.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
//实现BeanNameAware,ResourceLoaderAware接口，获得Bean名称和资源加载服务
public class AwareService implements BeanNameAware,ResourceLoaderAware{

	private String beanName;
	private ResourceLoader loader;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	
	public void outputResult(){
		System.out.println("Bean的名称："+beanName);
		
		Resource resource = loader.getResource("classpath:com/gnng/aware/test.txt");
		
		try {
			System.out.println("Resource加载的文件类容为：\n"+IOUtils.toString(resource.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
