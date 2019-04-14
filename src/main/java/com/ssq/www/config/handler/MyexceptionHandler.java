package com.ssq.www.config.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@ControllerAdvice
public class MyexceptionHandler  {

    /*这里处理自定义返回异常格式 全局异常*/
/*@ResponseBody
@ExceptionHandler//这个注解里面这可以指定异常类型来保证我们跑出的异常都有统一的数据返回
    public HashMap<String, Object>  handleException(Exception e) {
        HashMap<String, Object> hashMap = new HashMap<>();
         hashMap.put("code","22222222");
        hashMap.put("msg","测试");
        hashMap.put("msgdetil",e);
        return hashMap;
    }*/
}
