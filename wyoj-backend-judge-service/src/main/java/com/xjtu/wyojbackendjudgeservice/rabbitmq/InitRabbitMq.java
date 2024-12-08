package com.xjtu.wyojbackendjudgeservice.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InitRabbitMq {
    public static void doMqInit() {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("108.160.140.107");
            factory.setPort(5672);
            factory.setUsername("guest");
            factory.setPassword("123456");
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();
            String EXCHAGE_NAME = "wyoj_exchange";
            channel.exchangeDeclare(EXCHAGE_NAME, "direct");
            // 创建队列
            String queueName = "wyoj_queue";
            channel.queueDeclare(queueName, true, false, false, null);
            channel.queueBind(queueName, EXCHAGE_NAME, "oj_routingKey");
            log.info("RabbitMq消息队列初始化成功");
        } catch (Exception e) {
            log.info("RabbitMq消息队列初始化失败");
        }
    }
//    public static void main(String[] args) {
//        doMqInit();
//    }
}
