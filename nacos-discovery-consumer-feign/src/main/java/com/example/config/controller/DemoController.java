package com.example.config.controller;

import com.example.config.service.DemoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desription:
 *
 * @ClassName DemoController
 * @Author Zhanyuwei
 * @Date 2019/11/20 23:28
 * @Version 1.0
 **/

@RestController
public class DemoController {

    @Autowired
    private DemoFeignService demoFeignService;


    @GetMapping("/test")
    public String test(String name){
        return demoFeignService.demo( name);
    }
}
