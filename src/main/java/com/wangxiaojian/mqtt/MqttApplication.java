package com.wangxiaojian.mqtt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MqttApplication {

    public static void main(String[] args) {
        System.out.println("测试一下启动");
        SpringApplication.run(MqttApplication.class, args);
    }

}
