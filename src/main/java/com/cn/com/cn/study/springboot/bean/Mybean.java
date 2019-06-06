package com.cn.com.cn.study.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Mybean {
	@Value("${name}")
	private String name;

	@Override
	public String toString() {
		return "Mybean [name=" + name + "]";
	}
	
}
