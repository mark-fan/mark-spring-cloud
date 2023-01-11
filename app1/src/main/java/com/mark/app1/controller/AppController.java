package com.mark.app1.controller;

import com.mark.app1.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luofan
 */
@RestController
public class AppController {

    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(1, "mac", 23));
        userList.add(new User(2, "nico", 18));
        userList.add(new User(3, "mark", 33));
        userList.add(new User(4, "thomas", 43));
    }


    @Value("${spring.application.name}")
    private String name;

    @Value("${server.port}")
    private int port;

    @RequestMapping("/whichOne")
    public String whichOne() {
        return "我是" + name + " ,端口：" + port;
    }


    @GetMapping("/getOne")
    public String getOne(int id) {
        return userList.get(id - 1).toString();
    }

    @GetMapping("/getAll")
    public List<User> getAll() {
        return userList;
    }
}
