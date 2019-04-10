package com.ssq.www.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.ssq.www.config.interceptor.MyFilter;
import com.ssq.www.config.interceptor.MyListener;
import com.ssq.www.config.interceptor.Myinterptor;

/*springmvc的扩展类  保留自动配置
* @EnableWevMvc注解会让springmvc的自动配置失效从而我们由自己全面来配置
* */
@Configuration
public class MymvcConfig extends WebMvcConfigurerAdapter {

	/* 定制servlet容器的相关属性,优先代码配置 */
	@Bean
	public EmbeddedServletContainerCustomizer EmbeddedServletContainerCustomizer() {
		return new EmbeddedServletContainerCustomizer() {

			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				// TODO Auto-generated method stub
				container.setPort(8083);
			}
		};
	}

	/* mvc的配置 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// 重定向
		// registry.addRedirectViewController("");
		// 浏览器发送ssqurl回来到sucess页面
		registry.addViewController("/ssqurl").setViewName("success");
	}

	/* 自己写配置首页路径 将这些访问路径导航到success页面 */
	@Bean
	public WebMvcConfigurerAdapter ebMvcConfigurerAdapter() {

		WebMvcConfigurerAdapter webMvcConfigurerAdapter = new WebMvcConfigurerAdapter() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("success");
				registry.addViewController("/index.html").setViewName("success");
				registry.addViewController("/index").setViewName("success");
			}

			@Override
			public void addInterceptors(InterceptorRegistry registry) {
				registry.addInterceptor(new Myinterptor()).addPathPatterns("/");
			}

		};

		return webMvcConfigurerAdapter;
	}

	@Bean
	public MyFilter init() {
		return new MyFilter();
	}

/*	@Bean
	public FilterRegistrationBean servletRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new MyFilter());
		filterRegistrationBean.setUrlPatterns(Arrays.asList("hello","myswevlet"));
		return filterRegistrationBean;
	}
*/
	@Bean
	public MyListener initL() {
		return new MyListener();
	}
}
