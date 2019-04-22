package com.ssq.www.config.listenner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
/**
 * 自定义ApplicationRunner
 * @author ssq
 *下午4:47:18
 */
@Component
public class HelloApplicationRunner implements ApplicationRunner{


	@Override
	public void run(ApplicationArguments args) throws Exception {
	System.out.println("HelloApplicationRunner---------run ----------方法");
		
	}





}
