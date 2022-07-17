package com.yun.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName Producer
 * Description TODO
 * Author zhonghaigang
 * Date 2022/7/2 0:47
 * Version 1.0
 **/
@RestController
public class Producer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("/send/{topic}/{msg}")
    public String send(@PathVariable(value = "topic") String topic, @PathVariable(value = "msg") String msg){
        kafkaTemplate.send(topic,msg);

        return "kafka send success";
    }
}
