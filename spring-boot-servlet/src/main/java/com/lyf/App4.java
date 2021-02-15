package com.lyf;

import com.lyf.filter.SecondFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * springboot整合filter方法二
 * 使用bean注入
 */
@SpringBootApplication
public class App4{

    public static void main(String[] args) {

        SpringApplication.run(App4.class,args);
    }

    /**
     * Filter bean注入
     * @return
     */
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new SecondFilter());
        filterRegistrationBean.addUrlPatterns("/second");
        return filterRegistrationBean;
    }
}
