package com.frank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by frank on 2017/9/19.
 */

@EnableDiscoveryClient  // 让该应用注册为 Eureka 客户端应用， 以获得服务发现的能力。
@SpringBootApplication
public class ConsumerApplication {
    @Bean
    @LoadBalanced       // 注解开启客户端负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}