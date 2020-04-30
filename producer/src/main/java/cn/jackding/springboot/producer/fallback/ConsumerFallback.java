package cn.jackding.springboot.producer.fallback;

import cn.jackding.springboot.producer.sao.ConsumerService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Jack
 * @Date 2020/4/30 14:44
 * @Version 1.0.0
 */
@Component
public class ConsumerFallback implements ConsumerService {
    @Override
    public String helloCu(@RequestParam String name) {
        String helloFail = "Hello " + name + " Fail !!";
        System.out.println(helloFail);
        return helloFail;
    }
}
