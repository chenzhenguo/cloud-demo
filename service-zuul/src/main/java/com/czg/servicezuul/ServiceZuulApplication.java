package com.czg.servicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ServiceZuulApplication {

    //zuul 路由转发和过滤器的作用
   //zuul -https://www.fangzhipeng.com/springcloud/2018/08/05/sc-f5-zuul.html
    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }

}
