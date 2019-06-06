package com.cn.com.cn.study.springboot.start;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cn.com.cn.study.springboot.bean.Mybean;
import com.cn.com.cn.study.springboot.config.MyApplicaContext;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan("com.cn.com.cn.study.springboot")
public class Start {

    public  static  void main(String[] args ){
       // SpringApplication.run(Start.class,args);
    	SpringApplication app = new SpringApplication();
    	//app.setBannerMode(Banner.Mode.OFF);
    	//app.addListeners(new MyListener());
    	app.run(Start.class);
    	ApplicationContext applicationContext = MyApplicaContext.getApplicationContext();
    	Mybean myBean = applicationContext.getBean(Mybean.class);
    	System.out.println(myBean.toString());
    }
}
