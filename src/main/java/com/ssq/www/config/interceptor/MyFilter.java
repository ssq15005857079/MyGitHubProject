package com.ssq.www.config.interceptor;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("进入过滤器初始化方法。。。。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入过滤器dofilter方法。。。。。");
        filterChain.doFilter(servletRequest,servletResponse);
    }


    @Override
    public void destroy() {
        System.out.println("进入过滤器销毁方法。。。。。");
    }
    
    
}
