package com.ssq;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 *
 */
/*部署简单 将服务打成jar包 用Java-jar 来启动服务  服务器可以没有tomcat springboot内嵌tomcat
* 所有springboot项目都继承了spring-boot-starter-parent而副项目又继承了
* Spring Boot Dependencies（版本控制中心），这个版本控制中心规定了我们能够用到的大部分jar包的版本
* springboot将所有功能场取出来了，做成启动器，我们只要导入启动器就会导入所有的依赖
* */
//@SpringBootApplication相当于

//相当于：//@Configuration、 标志这是一个配置类 一个组件
// 		@EnableAutoConfiguration 开启自动配置
//			 @Import(EnableAutoConfigurationImportSelector.class) 将所有需要导入的组件已全类名的方式返回
//给容器中导入很多配置类xxx AutoConfiguration，导入并配置该启动器所需要的所有组件
// 里面有一个@AutoConfigurationPackage来自动配置包  下面的
// 			@Import(AutoConfigurationPackages.Registrar.class)注解给容器中导入由AutoConfigurationPackages注解的组件
//将主配置类下面的所有子包的组件扫描进容器中  主要调用了以下方法
//SpringFactoriesLoader.loadFactoryNames( EnableAutoConfiguration.class, getBeanClassLoader());
//从类路径下 META-INF/spring.factories 获取 EnableAutoConfiguration 指定的值
//将这些值作为自动配置类导入到容器中，自动配置类生效了 所用东西都在spring-boot-autoconfigure-1.5.9.RELEASE.jar 有了
//有了自动配置类我们就不需要手动导入和配置了
// @ServletComponentScan : Servlet、Filter、Listener 可以直接通过 @WebServlet、@WebFilter、@WebListener 注解自动注册，无需其他代码。
//    @ImportResource(locations = {"xxx.xml"."xxx.xml"})   导入配置文件
@SpringBootApplication
@ServletComponentScan
//这个注解添加了自动会将该包下面的所有类加上@Mapper注解
//@MapperScan(value="com.ssq.www")
public class HelloWorldApplocation {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplocation.class,args);
    }
}
