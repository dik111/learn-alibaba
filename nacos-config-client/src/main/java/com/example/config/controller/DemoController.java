package com.example.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desription:
 *
 * @ClassName DemoController
 * @Author Zhanyuwei
 * @Date 2019/11/23 9:56
 * @Version 1.0
 **/

@RefreshScope
@RestController
public class DemoController {

    @Value("${test:空test}")
    public String str;

    @GetMapping("/test/config")
    public String test(){
        return str;
    }
}
