package com.ssq.www.controller;

import com.ssq.www.PropertiesReadDemo;
import com.ssq.www.config.handler.MyException;

import java.util.List;
import java.util.Map;

import org.apache.catalina.core.ApplicationContext;
import org.apache.naming.java.javaURLContextFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	PropertiesReadDemo propertiesReadDemo;
	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping("hello")
	public String hello() {
		System.out.print(propertiesReadDemo);
		if (true) {
			throw new MyException();
		}
		return "hello";
	}
	@RequestMapping("quertlest")
	public List<Map<String, Object>> select() {
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select * from customer");
		return queryForList;
	}
	
}
