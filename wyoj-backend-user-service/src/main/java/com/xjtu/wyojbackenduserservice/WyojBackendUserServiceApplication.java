package com.xjtu.wyojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.xjtu.wyojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.xjtu")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.xjtu.wyojbackendserviceclient.service"})
public class WyojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WyojBackendUserServiceApplication.class, args);
    }

}
