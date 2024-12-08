package com.xjtu.wyojbackendjudgeservice;

import com.xjtu.wyojbackendjudgeservice.rabbitmq.InitRabbitMq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.xjtu")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.xjtu.wyojbackendserviceclient.service"})
public class WyojBackendJudgeServiceApplication {

    public static void main(String[] args) {
        InitRabbitMq.doMqInit(); // 初始化消息队列
        SpringApplication.run(WyojBackendJudgeServiceApplication.class, args);
    }

}
