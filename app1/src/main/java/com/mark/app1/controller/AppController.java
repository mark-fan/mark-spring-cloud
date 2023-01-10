package com.mark.app1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luofan
 */
@RestController
public class AppController {

    @Value("${spring.application.name}")
    private String name;

    @Value("${server.port}")
    private int port;

    @RequestMapping("/whichOne")
    public String whichOne() {
        return "我是" + name + " ,端口：" + port;
    }

}
