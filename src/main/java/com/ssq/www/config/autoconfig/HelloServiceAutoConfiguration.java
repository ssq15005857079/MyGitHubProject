package com.ssq.www.config.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
@ConditionalOnClass(HelloService.class)//:表示当classPath下存在HelloService.class文件时改配置文件类才有效
@EnableConfigurationProperties(value = HelloPropertiesDto.class)

public class HelloServiceAutoConfiguration {
	@Autowired
	HelloPropertiesDto  helloPropertiesDto;
	@Bean
	public HelloService helloService(){
		System.out.println("进入我的自动配置。。。。。。。。。。");
		HelloService helloService = new HelloService();
		helloService.setHelloPropertiesDto(helloPropertiesDto);
		return helloService;
		
	}

}
