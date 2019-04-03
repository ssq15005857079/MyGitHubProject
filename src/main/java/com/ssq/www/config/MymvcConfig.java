package com.ssq.www.config;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.ssq.www.config.interceptor.MyFilter;
import com.ssq.www.config.interceptor.MyInterceptor;
import com.ssq.www.config.interceptor.MyListener;

/*springmvc的扩展类  保留自动配置
* @EnableWevMvc注解会让springmvc的自动配置失效从而我们由自己全面来配置
* */
@Configuration
public class MymvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //重定向
        // registry.addRedirectViewController("");
        //浏览器发送ssqurl回来到sucess页面
        registry.addViewController("/ssqurl").setViewName("success");
    }

    /*自己写配置首页路径 将这些访问路径导航到success页面*/
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
            public void addInterceptors(InterceptorRegistry registry) {//设置拦截器
                registry.addInterceptor(new MyInterceptor()).addPathPatterns("/");
            }

        };

        return webMvcConfigurerAdapter;
    }


        @Bean
    public MyFilter init() {
        MyFilter myFilter = new MyFilter();
		return myFilter;
    }
        
/*        @Bean
    public MyFilter init() {
        	FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        	filterRegistrationBean.setFilter(new MyFilter());
        return (MyFilter) filterRegistrationBean.getFilter();
    }*/
        
        @Bean
    public MyListener initL(){
        return  new MyListener();
    }
}
