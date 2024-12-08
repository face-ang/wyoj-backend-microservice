package com.xjtu.wyojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.xjtu.wyojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.xjtu")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.xjtu.wyojbackendserviceclient.service"})
public class WyojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WyojBackendQuestionServiceApplication.class, args);
    }

}
