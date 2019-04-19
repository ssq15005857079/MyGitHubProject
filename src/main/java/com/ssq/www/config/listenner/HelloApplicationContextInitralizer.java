package com.ssq.www.config.listenner;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
/**
 * 自定义ApplicationContextInitializer
 * @author ssq
 *下午4:47:18
 */
@Configuration
public class HelloApplicationContextInitralizer implements ApplicationContextInitializer<ConfigurableApplicationContext>{

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("进入自定义ApplicationContextInitializer-------------------");
		
	}

}
