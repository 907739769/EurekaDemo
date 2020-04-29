package cn.jackding.springboot.consumer.sao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author Jack
 * @Date 2020/4/28 19:01
 * @Version 1.0.0
 */
@FeignClient("eureka-client-producer")
public interface ProducerService {

    @PostMapping("/test/hello")
    String hello();

}
