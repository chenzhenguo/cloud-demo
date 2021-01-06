package com.czg.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//启用eureka 客户端
@EnableEurekaClient
//和  EnableEurekaClient 功能一样，兼容其他 注册中心，EnableEurekaClient 仅支持 eureka
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeignApplication {
    //参考
//https://www.fangzhipeng.com/springcloud/2018/08/03/sc-f3-feign.html
    //添加 断路器 https://www.fangzhipeng.com/springcloud/2018/08/04/sc-f4-hystrix.html
    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }

}
