package com.example.nacosdiscoveryconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Desription:
 *
 * @ClassName DemoFeignService
 * @Author Zhanyuwei
 * @Date 2019/11/22 23:03
 * @Version 1.0
 **/
@FeignClient("nacos-discovery-provider")
public interface DemoFeignService {

    @GetMapping("/demo")
    String demo(@RequestParam("name") String name);
}
