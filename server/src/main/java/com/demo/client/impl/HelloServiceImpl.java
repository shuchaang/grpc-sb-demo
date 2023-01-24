package com.demo.client.impl;

import com.demo.proto.*;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@GrpcService
@Slf4j
public class HelloServiceImpl extends MyServiceGrpc.MyServiceImplBase {

    private final Random random = new Random();

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        log.info("server log {}",request);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String name = request.getName();
        HelloReply reply = HelloReply.newBuilder().setMessage("hello " + name+random.nextInt(10000)).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void listOrder(Buyer request, StreamObserver<OrderInfo> responseObserver) {
        List<OrderInfo> list = new ArrayList<>();
        OrderInfo.Builder builder = OrderInfo.newBuilder();
        for (int i = 0; i < 10; i++) {
            list.add(builder.setOrderId(i)
                            .setProductId(1000+i)
                            .setRemark("hhhh")
                            .setOrderTime(System.currentTimeMillis()/1000)
                    .build());
        }
        for (OrderInfo orderInfo : list) {
            log.info("order info {}",orderInfo);
            responseObserver.onNext(orderInfo);
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<ProductInfo> addToCart(StreamObserver<AddCartReply> responseObserver) {
        return new StreamObserver<ProductInfo>() {
            private int totalCount=0;
            @Override
            public void onNext(ProductInfo productInfo) {
                log.info("正在处理商品:{},{}",productInfo.getProductId(),productInfo.getProductNum());
                totalCount+=productInfo.getProductNum();
            }

            @Override
            public void onError(Throwable throwable) {
                log.error("添加购物车异常:",throwable);
            }

            @Override
            public void onCompleted() {
                log.info("添加购物车完成,共{}",totalCount);
                responseObserver.onNext(AddCartReply.newBuilder().setCode(200).setMessage("ok").build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<ProductInfo> batchDeduct(StreamObserver<AddCartReply> responseObserver) {
        return new StreamObserver<ProductInfo>() {
            private  int count  = 0;
            @Override
            public void onNext(ProductInfo productInfo) {
                    log.info("product:{},{}",productInfo.getProductId(),productInfo.getProductNum());
                    count+=productInfo.getProductNum();

                    int code;
                    String message;

                    if(productInfo.getProductNum()%2==1){
                        code= 10000;
                        message="成功";
                    }else{
                        code=10001;
                        message="失败，库存不足";
                    }
                    responseObserver.onNext(AddCartReply.newBuilder()
                            .setMessage(message).setCode(code).build());
            }

            @Override
            public void onError(Throwable throwable) {
                log.error("扣减库存异常",throwable);
            }

            @Override
            public void onCompleted() {
                log.info("扣减完成,total:{}",count);
                responseObserver.onCompleted();
            }
        };
    }
}
