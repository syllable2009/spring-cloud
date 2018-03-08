package com.jxp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jxp.service.CommonService;


@RestController
public class CommonServiceController {

	 @Autowired
	CommonService commonService;
	
	 @RequestMapping(value = "/times")
	 Object getTimes(){
		 return commonService.getTimes();
	 }
	 
	 @RequestMapping(value = "/score")
	 Object sayHello(){
		 return commonService.sayHello();
	 }
	
}
