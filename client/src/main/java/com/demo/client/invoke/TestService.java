package com.demo.client.invoke;

import com.demo.proto.*;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class TestService {


    @GrpcClient("server-side")
    private MyServiceGrpc.MyServiceBlockingStub myServiceBlockingStub;
    @GrpcClient("server-side")
    private MyServiceGrpc.MyServiceStub streamStub;


    public String hello(){
        HelloRequest request = HelloRequest.newBuilder().setName("shuchang").build();
        HelloReply helloReply = myServiceBlockingStub.sayHello(request);
        return helloReply.getMessage();
    }

    public String listOrder(){
        Buyer build = Buyer.newBuilder().setBuyerId(1).build();
        Iterator<OrderInfo> orderInfoIterator;
        try {
            orderInfoIterator = myServiceBlockingStub.listOrder(build);
        }catch (Exception e){
            return "error";
        }
        while(orderInfoIterator.hasNext()){
            OrderInfo next = orderInfoIterator.next();
            log.info("order info:{}",next);
        }
        return "ok'";

    }

    public String addToCart(int num){
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ExtendResponseObserver<AddCartReply> observer = new ExtendResponseObserver<>() {
            String extra;

            private int code;
            private String message;

            @Override
            public void onNext(AddCartReply addCartReply) {
                code=  addCartReply.getCode();
                message=addCartReply.getMessage();
                log.info("next,{},{}",code,message);
            }

            @Override
            public void onError(Throwable throwable) {
                log.info("error",throwable);
                countDownLatch.countDown();
            }

            @Override
            public void onCompleted() {
                log.info("complete");
                extra=code+message;
                countDownLatch.countDown();
            }

            @Override
            public String getExtra() {
                return extra;
            }
        };

        StreamObserver<ProductInfo> productInfoStreamObserver = streamStub.addToCart(observer);
        for (int i = 0; i < num; i++) {
            productInfoStreamObserver.onNext(ProductInfo.newBuilder().
                    setProductId(100+i).setProductNum(i+1).build());
        }
        productInfoStreamObserver.onCompleted();

        try {
            countDownLatch.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            log.error("timeout error");
        }
        return observer.getExtra();
    }



    public String deduct(int num){
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ExtendResponseObserver<AddCartReply> observer = new ExtendResponseObserver<>() {
            String extra;

            private int code;
            private String message;

            @Override
            public void onNext(AddCartReply addCartReply) {
                code=  addCartReply.getCode();
                message=addCartReply.getMessage();
                log.info("next,{},{}",code,message);
            }

            @Override
            public void onError(Throwable throwable) {
                log.info("error",throwable);
                countDownLatch.countDown();
            }

            @Override
            public void onCompleted() {
                log.info("complete");
                extra=code+message;
                countDownLatch.countDown();
            }

            @Override
            public String getExtra() {
                return extra;
            }
        };

        StreamObserver<ProductInfo> productInfoStreamObserver = streamStub.batchDeduct(observer);
        for (int i = 0; i < num; i++) {
            productInfoStreamObserver.onNext(ProductInfo.newBuilder().
                    setProductId(100+i).setProductNum(i+1).build());
        }
        productInfoStreamObserver.onCompleted();

        try {
            countDownLatch.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            log.error("timeout error");
        }
        return observer.getExtra();
    }

}
