package com.crips.sonsumerfeign.service;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("provider-user")
public interface UserClient {

    /**
     * Feign中没有原生的@GetMapping/@PostMapping/@DeleteMapping/@PutMapping，要指定需要用method进行
     *
     *
     * 接口上方用requestmapping指定是服务提供者的哪个controller提供服务
     */
    @RequestMapping(value="/user/sayHello",method= RequestMethod.GET)
    public String sayHello();

    @RequestMapping(value="/user/sayHi",method=RequestMethod.GET)
    public String sayHi();

    @RequestMapping(value="/user/sayHaha",method=RequestMethod.GET)
    public String sayHaha();

}
