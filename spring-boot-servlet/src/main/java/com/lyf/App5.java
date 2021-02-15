package com.lyf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * springboot 整合 Listener 监听器 方法1
 * @ServletComponentScan  扫描WebListener注解下的类，并实例化
 */
@SpringBootApplication
@ServletComponentScan
public class App5{

    public static void main(String[] args) {
        SpringApplication.run(App5.class,args);
    }

}
