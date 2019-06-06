package com.cn.com.cn.study.springboot.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MyApplicaContext implements ApplicationContextAware {
	
	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		MyApplicaContext.applicationContext = arg0;
		
	}

	public static ApplicationContext getApplicationContext() {
		return MyApplicaContext.applicationContext;
	}
	
}
