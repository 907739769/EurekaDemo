package cn.jackding.springboot.producer.service.impl;

import cn.jackding.springboot.producer.service.Hello;
import org.springframework.stereotype.Service;

/**
 * @Author Jack
 * @Date 2020/4/28 17:13
 * @Version 1.0.0
 */
@Service
public class HelloService implements Hello {
    @Override
    public String hello() {
        System.out.println("hello world");
        return "Hello World !";
    }
}
