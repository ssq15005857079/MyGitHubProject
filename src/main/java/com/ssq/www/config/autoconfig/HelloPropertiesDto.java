package com.ssq.www.config.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix="auto.hello")
@Data
public class HelloPropertiesDto {
	private String prefix;
	private String suffer;

	
	

}
