package com.mark.gateway.filter;

import org.springframework.cloud.gateway.filter.ratelimit.AbstractRateLimiter;
import org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;
import reactor.core.publisher.Mono;
import com.google.common.util.concurrent.RateLimiter;

/**
 * @author luofan
 */
@Component
@Primary
public class DefaultRateLimiter extends AbstractRateLimiter<RedisRateLimiter.Config> {


    protected DefaultRateLimiter(Class<RedisRateLimiter.Config> configClass, String configurationPropertyName, Validator validator) {
        super(configClass, configurationPropertyName, validator);
    }

    private final RateLimiter limiter = RateLimiter.create(1);

    @Override
    public Mono<Response> isAllowed(String routeId, String id) {
        return null;
    }
}
