package cn.jackding.springboot.producer.controller;

import cn.jackding.springboot.producer.sao.ConsumerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    private ConsumerService consumerService;

    @PostMapping("/hello")
    public String hello(@RequestParam String name) {
        String hello="Hello "+name+" !";
        System.out.println(hello);
        return hello;
    }

    @PostMapping("/helloPr")
    public String helloPr(@RequestParam String name) {
       return consumerService.helloCu(name);
    }

}
