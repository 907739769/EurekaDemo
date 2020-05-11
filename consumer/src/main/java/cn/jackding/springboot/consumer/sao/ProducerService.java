package cn.jackding.springboot.consumer.sao;

import cn.jackding.springboot.consumer.sao.fallback.ProducerFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Jack
 * @Date 2020/4/28 19:01
 * @Version 1.0.0
 */
@FeignClient(value = "eureka-client-producer",fallback = ProducerFallback.class)
//@FeignClient(value = "eureka-client-producer")
public interface ProducerService {

    @PostMapping("/test/helloPr")
    String hello(@RequestParam String name);

}
