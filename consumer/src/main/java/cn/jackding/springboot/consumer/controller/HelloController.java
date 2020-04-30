package cn.jackding.springboot.consumer.controller;

import cn.jackding.springboot.consumer.sao.ProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author Jack
 * @Date 2020/4/28 19:07
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/cu")
public class HelloController {

    @Resource
    private ProducerService producerService;

    @PostMapping("/hello")
    public String hello(@RequestParam String name) {
        return producerService.hello(name);
    }

    @PostMapping("/helloCu")
    public String helloCu(@RequestParam String name) {
        String hello = "Hello " + name + " !!";
        System.out.println(hello);
        return hello;
    }

}
