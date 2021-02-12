package com.maersk.nativeexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@SpringBootApplication
public class NativeExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeExampleApplication.class, args);
    }

    @Bean
    public RouterFunction<ServerResponse> route(BasicHandler handler) {
        return RouterFunctions.route(GET("/hello"), handler::hello);

    }

    @Component
    public class BasicHandler {
        public Mono<ServerResponse> hello(ServerRequest request) {
            return ServerResponse.ok().bodyValue("");
        }
    }
}
