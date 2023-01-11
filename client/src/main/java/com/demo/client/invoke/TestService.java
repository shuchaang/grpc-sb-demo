package com.demo.client.invoke;

import com.demo.proto.HelloReply;
import com.demo.proto.HelloRequest;
import com.demo.proto.MyServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

@Service
public class TestService {


    @GrpcClient("grpc-server")
    private MyServiceGrpc.MyServiceBlockingStub myServiceBlockingStub;


    public String hello(){
        HelloRequest request = HelloRequest.newBuilder().setName("shuchang").build();
        HelloReply helloReply = myServiceBlockingStub.sayHello(request);
        return helloReply.getMessage();
    }
}
