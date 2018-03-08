package com.jxp.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("common-service")
public interface CommonService {
	
	
	 @RequestMapping(value = "/times")
	 Object getTimes();
	 
	 @RequestMapping(value = "/score")
	 Object sayHello();

}
