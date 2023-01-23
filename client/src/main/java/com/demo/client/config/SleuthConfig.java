package com.demo.client.config;

import brave.Tracer;
import brave.Tracing;
import brave.grpc.GrpcTracing;
import io.grpc.ClientInterceptor;
import io.grpc.ServerInterceptor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.interceptor.GlobalClientInterceptorConfigurer;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class SleuthConfig {

    @Bean
    public GrpcTracing grpcTracing(Tracing tracing){
        return  GrpcTracing.create(tracing);
    }

    @Bean
    @GrpcGlobalClientInterceptor
    public ClientInterceptor clientInterceptor(GrpcTracing grpcTracing){
        return grpcTracing.newClientInterceptor();
    }
    @Bean
    @GrpcGlobalServerInterceptor
    ServerInterceptor grpcServerSleuthInterceptor(GrpcTracing grpcTracing) {
        return grpcTracing.newServerInterceptor();
    }
}
