package com.lyf;

import com.lyf.Listener.SecondListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * springboot 整合 Listener 监听器方法2
 * 使用bean注入
 */
@SpringBootApplication
public class App6{

    public static void main(String[] args) {
        SpringApplication.run(App6.class,args);
    }

    /**
     * Bean注入
     */
    @Bean
    public ServletListenerRegistrationBean<SecondListener> getServletListener(){
        ServletListenerRegistrationBean<SecondListener> secondListenerServletListenerRegistrationBean= new ServletListenerRegistrationBean<SecondListener>(new SecondListener());
        return secondListenerServletListenerRegistrationBean;
    }
}
