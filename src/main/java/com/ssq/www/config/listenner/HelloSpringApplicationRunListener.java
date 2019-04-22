package com.ssq.www.config.listenner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
/**
 * 自定义SpringApplicationRunListener
 * @author ssq
 *下午4:47:18
 */
public class HelloSpringApplicationRunListener implements SpringApplicationRunListener{
	public HelloSpringApplicationRunListener(SpringApplication application, String[] args) {
		
	}
	
	@Override
	public void starting() {
		System.out.println("HelloSpringApplicationRunListener-------starting-----");
		
	}

	@Override
	public void environmentPrepared(ConfigurableEnvironment environment) {
		System.out.println("HelloSpringApplicationRunListener-------environmentPrepared-----");
		
	}

	@Override
	public void contextPrepared(ConfigurableApplicationContext context) {
		System.out.println("HelloSpringApplicationRunListener-------contextPrepared-----");	}

	@Override
	public void contextLoaded(ConfigurableApplicationContext context) {
		System.out.println("HelloSpringApplicationRunListener-------contextLoaded-----");		
	}

	@Override
	public void finished(ConfigurableApplicationContext context, Throwable exception) {
		System.out.println("HelloSpringApplicationRunListener-------finished-----");		
	}




}
