package com.ssq.www.config.autoconfig;

import lombok.Data;

@Data
public class HelloService {
	private HelloPropertiesDto helloPropertiesDto;
	
	public String sayHello(String username){
		return helloPropertiesDto.getPrefix()+username+helloPropertiesDto.getSuffer();
	}

}
