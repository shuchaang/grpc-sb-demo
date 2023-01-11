package com.demo.client.impl;

import com.demo.proto.HelloReply;
import com.demo.proto.HelloRequest;
import com.demo.proto.HelloWorldProto;
import com.demo.proto.MyServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HelloServiceImpl extends MyServiceGrpc.MyServiceImplBase {


    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        String name = request.getName();
        HelloReply reply = HelloReply.newBuilder().setMessage("hello " + name).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
