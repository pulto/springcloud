package com.lic.cosmodata.client.impl;

import com.lic.cosmodata.client.FeignEurekaClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixFallbackFactory implements FallbackFactory<FeignEurekaClient> {
    @Override
    public FeignEurekaClient create(Throwable throwable) {
        return ()->(throwable.toString());
    }
}
