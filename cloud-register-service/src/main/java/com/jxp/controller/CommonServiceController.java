package com.jxp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CommonServiceController {

	 @Autowired
	 private DiscoveryClient client;
	
	 @RequestMapping(value = "/times")
	 Object getTimes(){
		 System.out.println("-----------getTimes--------------");
		 return System.currentTimeMillis();
	 }
	 
	 @RequestMapping(value = "/score")
	 Object sayHello(){
		 System.out.println("-----------sayHello--------------");
		 return (int)(Math.random()*100);
	 }
	
}
