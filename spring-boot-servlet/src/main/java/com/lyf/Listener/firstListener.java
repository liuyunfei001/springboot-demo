package com.lyf.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;
import javax.servlet.ServletContextListener;

@WebListener
public class firstListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Listener.......监听器已启动！！！");
    }

}
