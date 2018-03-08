package com.jxp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //注解@RefreshScope指示Config客户端在服务器参数刷新时，也刷新注入的属性值
public class MySampleRestController {
	@Value("${mysqldb.datasource.url}")
	private String value;
	
	@RequestMapping("/value")
	public String getValue() {
		return value;
	}
}
