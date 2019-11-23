package com.example.nacosdiscoveryprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desription:
 *
 * @ClassName DemoController
 * @Author Zhanyuwei
 * @Date 2019/11/20 23:25
 * @Version 1.0
 **/

@RestController
public class DemoController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/demo")
    public String demo(String name) {
        return "hello " + name + port;
    }
}
