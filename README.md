# Spring Boot(Cloud) GRPC

This project contains server side and client side build by springboot, use eureka to achieve service registry,
use sleuth to achieve traceId,logback to record local file,use zipkin for traceId UI

For study gRpc on java

##  Env Prepare:

1. docker run -d -p 9411:9411 openzipkin/zipkin,if running locally http://localhost:9411
2. JDK11/Springboot 2.6.x/SpringCloud 2021.x

