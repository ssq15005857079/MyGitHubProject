/*package com.ssq.www.config.druid;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.HashMap;

import javax.activation.DataSource;
import javax.servlet.DispatcherType;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configurable
public class DruidConfig {
	//将配置写在核心配置文件 这里对应注入
	@ConfigurationProperties(prefix="spring.datasource")
	@Bean
	 public DataSource druid(){
		 DruidDataSource druidDataSource = new DruidDataSource();
		 druidDataSource.setDbType("com.alibaba.druid.pool.DruidDataSource");
		return (DataSource) druidDataSource;
	 }
	//配置监控
//	1.配置后台管理的servlet
	@Bean
	public ServletRegistrationBean statViewServlet(){
		ServletRegistrationBean servletRegistrationBean = 
				new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
		servletRegistrationBean.setUrlMappings(Arrays.asList("/myduid"));
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("loginUsername", "ssq");
		hashMap.put("loginPassword", "ssq");
		hashMap.put("allow", "localhost");//白名单  默认所有
		//hashMap.put("deny", "192.168.189.129");//黑名单  默认所有
		servletRegistrationBean.setInitParameters(hashMap);
		return servletRegistrationBean;
	}
//	2.配置一个filter监控
	@Bean
	public FilterRegistrationBean webStatFilter(){
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new WebStatFilter());
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("exclusions", "*.js,*.css,*.html,/druid/*");
		filterRegistrationBean.setInitParameters(hashMap);
		filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
		return filterRegistrationBean;
	}
}
*/