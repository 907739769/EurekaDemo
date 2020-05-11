package cn.jackding.springboot.producer.sao;

import cn.jackding.springboot.producer.fallback.ConsumerFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Jack
 * @Date 2020/4/30 15:23
 * @Version 1.0.0
 */
@FeignClient(value = "eureka-client-consumer",fallback = ConsumerFallback.class)
public interface ConsumerService {
    @PostMapping("/cu/helloCu")
    String hello(@RequestParam String name);
}
