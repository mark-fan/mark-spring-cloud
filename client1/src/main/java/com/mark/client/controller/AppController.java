package com.mark.client.controller;

import com.mark.client.model.User;
import com.mark.client.service.Client1Service;
import com.mark.common.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luofan
 */
@RestController
public class AppController {

    @Autowired
    Client1Service client1Service;
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

    @RequestMapping(value = "/client/{input}", method = RequestMethod.GET)
    public ResponseResult<String> getClient(@PathVariable("input") String input) {
        return client1Service.getClient(input);
    }

}
