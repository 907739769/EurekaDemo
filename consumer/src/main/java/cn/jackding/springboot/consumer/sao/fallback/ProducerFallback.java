package cn.jackding.springboot.consumer.sao.fallback;

import cn.jackding.springboot.consumer.sao.ProducerService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Jack
 * @Date 2020/4/30 14:44
 * @Version 1.0.0
 */
@Component
public class ProducerFallback implements ProducerService {
    @Override
    public String hello(@RequestParam String name) {
        String helloFail = "Hello " + name + " Fail !";
        System.out.println(helloFail);
        return helloFail;
    }
}
