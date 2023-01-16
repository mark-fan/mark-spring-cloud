package com.mark.configserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luofan
 */

@RestController
@RequestMapping("/config")
public class ConfigTestController {

    private String env;

    @GetMapping("/env")
    public String test() {
        return env;
    }
}
