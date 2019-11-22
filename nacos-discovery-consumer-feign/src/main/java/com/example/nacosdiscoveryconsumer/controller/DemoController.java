package com.example.nacosdiscoveryconsumer.controller;

import com.example.nacosdiscoveryconsumer.service.DemoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URL;

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
