package com.czg.servicefeign;

import org.springframework.stereotype.Component;

//断路器 异常处理类，需要实现 fengin的接口
@Component
public class SchedualServiceHiHystric implements  SchedualServiceHi{

    @Override
    public String sayHiFromClinetOne(String name) {
        return "sorry"+ name;
    }
}
