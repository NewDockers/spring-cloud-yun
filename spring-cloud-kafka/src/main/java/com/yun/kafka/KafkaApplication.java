package com.yun.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName KafkaApplication
 * Description TODO
 * Author zhonghaigang
 * Date 2022/7/1 23:06
 * Version 1.0
 **/

@EnableDiscoveryClient
@SpringBootApplication
public class KafkaApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class,args);
    }
}
