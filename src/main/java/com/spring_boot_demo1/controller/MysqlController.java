package com.spring_boot_demo1.controller;

import com.spring_boot_demo1.mysql.service.UserService;
import com.spring_boot_demo1.mysql.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*直接返回*/
@Component
public class MysqlController {

    @Autowired
    public UserService userService;

    @RequestMapping("insert-user/{username}")
    public String InsertUser(@PathVariable String username) {
        User user = new User();
        System.out.println("--------------------:username");
        System.out.println(username);

        user.setUsername(username);
        userService.save(user);
        return user.toString();
    }

    @RequestMapping("insert-user-t")
    public String InsertUserT() {
        User user = new User();
        user.setUsername("zzzz");
        userService.saveWithTransactional(user);
        return user.toString();
    }


}
