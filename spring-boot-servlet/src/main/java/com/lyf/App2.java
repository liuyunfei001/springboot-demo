package com.lyf;

import com.lyf.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * springboot 整合servlet 方法二
 * 使用bean方法注入
 */
@SpringBootApplication
public class App2{

    public static void main(String[] args) {
        SpringApplication.run(App2.class,args);
    }


    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new SecondServlet());
        servletRegistrationBean.addUrlMappings("/second");
        return servletRegistrationBean;
    }
}
