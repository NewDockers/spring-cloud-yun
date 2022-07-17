package com.yun.system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName RestTemplateConfiguration
 * Description  增加RestTemplate配置类
 * Author zhonghaigang
 * Date 2022/6/29 23:49
 * Version 1.0
 **/
@Configuration
public class RestTemplateConfiguration {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
