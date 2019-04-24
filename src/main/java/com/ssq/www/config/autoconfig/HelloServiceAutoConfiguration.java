package com.ssq.www.config.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(HelloPropertiesDto.class)
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
