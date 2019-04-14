package com.ssq.www.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssq.www.PropertiesReadDemo;
import com.ssq.www.config.handler.MyException;
import com.ssq.www.dao.CustomerDao;

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
	
	@Autowired
	CustomerDao customerDao;
	@RequestMapping("quertlest")
	public List<Map<String, Object>> select() throws Exception {
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select * from customer");
		List<Map<?, ?>> list = customerDao.getAll();
		list.forEach(s->{
			s.forEach((key,value)->{
				System.out.println("key"+key+"value"+value);
			});
			
		});
		return queryForList;
	}
	
}
