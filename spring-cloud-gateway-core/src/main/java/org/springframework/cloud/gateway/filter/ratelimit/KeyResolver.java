package org.springframework.cloud.gateway.filter.ratelimit;

import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author Spencer Gibb
 */
// TODO: 2019/01/24 by zmyer
public interface KeyResolver {
    Mono<String> resolve(ServerWebExchange exchange);
}
