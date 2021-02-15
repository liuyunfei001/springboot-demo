package com.lyf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


/**
 * Springboot 启动类
 * @SpringBootApplication启动类注解
 * @ServletComponentScan  扫描WebServlet注解下的类，并实例化
 */
@SpringBootApplication
@ServletComponentScan
public class App{

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

}
