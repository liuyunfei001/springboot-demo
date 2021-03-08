package com.lyf.controller;

import com.lyf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * springboot整合jsp
 *
 */
@Controller
public class UserController {

    @RequestMapping("getUsers")
    public String getUsers(Model mdel){
        List<User> userList = new ArrayList <>();
        userList.add(new User("张三",22,"男"));
        userList.add(new User("李四",23,"男"));
        userList.add(new User("王五",24,"男"));
        userList.add(new User("小娟",21,"女"));
        mdel.addAttribute("userList",userList);
        return "userList";
    }
}
