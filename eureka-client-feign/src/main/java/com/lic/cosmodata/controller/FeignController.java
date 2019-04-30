package com.lic.cosmodata.controller;

import com.lic.cosmodata.client.FeignEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignEurekaClient  feignEurekaClient;

    @GetMapping("/test")
    public String test(){

        return feignEurekaClient.eureka();
    }
}
