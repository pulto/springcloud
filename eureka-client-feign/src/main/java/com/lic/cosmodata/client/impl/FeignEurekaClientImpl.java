package com.lic.cosmodata.client.impl;

import com.lic.cosmodata.client.FeignEurekaClient;
import org.springframework.stereotype.Component;

@Component
public class FeignEurekaClientImpl implements FeignEurekaClient {
    @Override
    public String eureka() {
        return "調用eureka-one失敗";
    }
}
