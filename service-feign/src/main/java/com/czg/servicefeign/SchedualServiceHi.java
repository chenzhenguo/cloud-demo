package com.czg.servicefeign;

import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//feign 客户端 链接服务 service-hi
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    //调用 service-hi 的接口  hi
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClinetOne(@RequestParam(value = "name") String name);


}
