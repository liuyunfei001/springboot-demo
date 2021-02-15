package com.lyf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Springboot 启动类
 * springboot 整合filter方法一
 * @SpringBootApplication启动类注解
 * @ServletComponentScan  扫描WebFilter注解下的类，并实例化
 */
@SpringBootApplication
@ServletComponentScan
public class App3{

    public static void main(String[] args) {
        SpringApplication.run(App3.class,args);
    }

}
