package com.ssq.www.config.listenner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
/**
 * 自定义CommandLineRunner
 * @author ssq
 *下午4:47:18
 */
@Configuration
public class HelloCommandLineRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("HelloCommandLineRunner---------run ----------方法");
		
	}







}
