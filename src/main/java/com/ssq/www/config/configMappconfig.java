package com.ssq.www.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/*指明当前类为配置类
* bean 相当于向容器中加入改返回值 添加组件
* */
@Configuration
public class configMappconfig {
    @Bean
    public List helloService(){
        ArrayList<String> lis = new ArrayList<>();
        return  lis;
    }
}
