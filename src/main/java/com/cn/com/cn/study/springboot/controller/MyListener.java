package com.cn.com.cn.study.springboot.controller;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class MyListener implements ApplicationListener<ApplicationStartingEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		System.out.println("这个listener的执行时机是++++++++");
		
	}

}
