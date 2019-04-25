package com.ssq.www;

import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import sun.applet.Main;

import java.util.Map;

@Component
/*@Validated 类型加上这个注解表示这个类的属性需要校验
*  @Email   属性上加上这个注解表示需要填的属性是邮箱类型
* */
/*
* ConfigurationProperties 多个一起赋值
* Value 只能单个赋值  不支持复杂类型如map
* */
@ConfigurationProperties(prefix = "user")
//@PropertySource("") 读取指定位置的配置文件 配合value使用
public class PropertiesReadDemo {

    private String username;
    private Integer age;

    private Map classGrade;
/*    @Value("${test11}")
    private String testsss;*/
/*    public String getTestsss() {
        return testsss;
    }*/
    @Override
    public String toString() {
        return "PropertiesReadDemo{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", classGrade=" + classGrade +
                ", testsss=" + /*testsss*/ +
                '}';
    }


/*
    public void setTestsss(String testsss) {
        this.testsss = testsss;
    }*/



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Map getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(Map classGrade) {
        this.classGrade = classGrade;
    }

    public static void main(String[] args) {
        PropertiesReadDemo user= new PropertiesReadDemo();
        System.out.print(user);
    }
}
