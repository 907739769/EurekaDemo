package cn.jackding.springboot.producer.controller;

import cn.jackding.springboot.producer.service.Hello;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author Jack
 * @Date 2020/4/28 17:16
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/test")
public class HelloController {

    @Resource
    private Hello hello;

    @PostMapping("/hello")
    public String hello(){
        return hello.hello();
    }

}
