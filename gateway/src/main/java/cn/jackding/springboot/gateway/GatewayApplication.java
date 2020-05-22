package cn.jackding.springboot.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
////                .route("path_route", r -> r.path("/cu/**")
////                        .uri("http://127.0.0.1:8101"))
////                .route("host_route", r -> r.host("localhost")
////                        .uri("http://www.baidu.com"))？？？？？？？
////                .route("rewrite_route", r -> r.alwaysTrue()
////                        .filters(f -> f.rewritePath("/foo/(?<segment>.*)", "/${segment}"))
////                        .uri("lb://eureka-client-consumer"))
////                .route("hystrix_route", r -> r.alwaysTrue()
////                        .filters(f -> f.hystrix(c -> c.setName("slowcmd")))
////                        .uri("lb://eureka-client-consumer"))
////                .route("hystrix_fallback_route", r -> r.host("*.hystrixfallback.org")
////                        .filters(f -> f.hystrix(c -> c.setName("slowcmd").setFallbackUri("forward:/hystrixfallback")))
////                        .uri("http://httpbin.org"))
//                .route("limit_route", r -> r
//                        .path("/eureka-client-consumer/**")
//                        .filters(f -> f.requestRateLimiter(c -> {
//                            c.setRateLimiter(redisRateLimiter());
//                            c.setKeyResolver(hostKeyResolver());
//                        }).stripPrefix(1))
//                        .uri("lb://eureka-client-consumer"))
//                .build();
//    }

//    @Bean
//    public RedisRateLimiter redisRateLimiter() {
//        return new RedisRateLimiter(5,10);
//    }

//    @Bean
//    public KeyResolver hostKeyResolver(){
//        return exchange -> Mono.just(Objects.requireNonNull(exchange.getRequest().getRemoteAddress()).getHostString());
//    }

    @Bean
    public GlobalFilter globalFilter(){
        return (exchange, chain) -> {
            long a=System.currentTimeMillis();
          return   chain.filter(exchange).then(Mono.fromRunnable(()->{
              System.out.println(exchange.getAttributes());
              System.out.println("服务耗时"+(System.currentTimeMillis()-a)+"毫秒");
            }));
        };
    }

}
