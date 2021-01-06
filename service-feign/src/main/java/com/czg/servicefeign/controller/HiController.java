package com.czg.servicefeign.controller;

import com.czg.servicefeign.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String  sayHi(@RequestParam String name){
        //调用fegin 的接口 实现rpc 调用
        return  schedualServiceHi.sayHiFromClinetOne(name);
    }
}
