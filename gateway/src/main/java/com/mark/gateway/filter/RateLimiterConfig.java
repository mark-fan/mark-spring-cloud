package com.mark.gateway.filter;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * @author luofan
 */
@Component
public class RateLimiterConfig {
    @Bean
    KeyResolver userKeyResolver(){
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("id"));
    }
}
