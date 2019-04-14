package com.ssq.www;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.ssq.HelloWorldApplocation;


/**
 * 来设置外部tomcat容器
 * @author ssq
 *下午1:41:54
 */
public class SpringBootInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		//将当前类的主类字节码导入
		return builder.sources(HelloWorldApplocation.class);
	}
 
}
