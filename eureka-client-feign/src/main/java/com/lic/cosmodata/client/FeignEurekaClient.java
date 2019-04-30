package com.lic.cosmodata.client;

import com.lic.cosmodata.client.impl.FeignEurekaClientImpl;
import com.lic.cosmodata.client.impl.HystrixFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client-one",fallback = FeignEurekaClientImpl.class)
//@FeignClient(value = "eureka-client-one",fallback = HystrixFallbackFactory.class)
public interface FeignEurekaClient {
    @GetMapping("/hello")
    public String  eureka();
}
