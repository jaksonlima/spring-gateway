package com.app.gateway.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpbinGateway {

    @Bean
    public RouteLocator HttpbinRouteLocator(final RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_route", r -> r.path("/api/**")
                        .filters(f -> f.setPath("/"))
                        .uri("http://httpbin.org"))
                .build();
    }

}
