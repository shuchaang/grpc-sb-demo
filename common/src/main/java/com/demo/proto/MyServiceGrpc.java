package com.demo.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: demo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MyServiceGrpc {

  private MyServiceGrpc() {}

  public static final String SERVICE_NAME = "com.demo.proto.MyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.demo.proto.HelloRequest,
      com.demo.proto.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.demo.proto.HelloRequest.class,
      responseType = com.demo.proto.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.demo.proto.HelloRequest,
      com.demo.proto.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.demo.proto.HelloRequest, com.demo.proto.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = MyServiceGrpc.getSayHelloMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getSayHelloMethod = MyServiceGrpc.getSayHelloMethod) == null) {
          MyServiceGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.demo.proto.HelloRequest, com.demo.proto.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.proto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.proto.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.demo.proto.Buyer,
      com.demo.proto.OrderInfo> getListOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrder",
      requestType = com.demo.proto.Buyer.class,
      responseType = com.demo.proto.OrderInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.demo.proto.Buyer,
      com.demo.proto.OrderInfo> getListOrderMethod() {
    io.grpc.MethodDescriptor<com.demo.proto.Buyer, com.demo.proto.OrderInfo> getListOrderMethod;
    if ((getListOrderMethod = MyServiceGrpc.getListOrderMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getListOrderMethod = MyServiceGrpc.getListOrderMethod) == null) {
          MyServiceGrpc.getListOrderMethod = getListOrderMethod =
              io.grpc.MethodDescriptor.<com.demo.proto.Buyer, com.demo.proto.OrderInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.proto.Buyer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.proto.OrderInfo.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("ListOrder"))
              .build();
        }
      }
    }
    return getListOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.demo.proto.ProductInfo,
      com.demo.proto.AddCartReply> getAddToCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToCart",
      requestType = com.demo.proto.ProductInfo.class,
      responseType = com.demo.proto.AddCartReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.demo.proto.ProductInfo,
      com.demo.proto.AddCartReply> getAddToCartMethod() {
    io.grpc.MethodDescriptor<com.demo.proto.ProductInfo, com.demo.proto.AddCartReply> getAddToCartMethod;
    if ((getAddToCartMethod = MyServiceGrpc.getAddToCartMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getAddToCartMethod = MyServiceGrpc.getAddToCartMethod) == null) {
          MyServiceGrpc.getAddToCartMethod = getAddToCartMethod =
              io.grpc.MethodDescriptor.<com.demo.proto.ProductInfo, com.demo.proto.AddCartReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddToCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.proto.ProductInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.proto.AddCartReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("AddToCart"))
              .build();
        }
      }
    }
    return getAddToCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.demo.proto.ProductInfo,
      com.demo.proto.AddCartReply> getBatchDeductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchDeduct",
      requestType = com.demo.proto.ProductInfo.class,
      responseType = com.demo.proto.AddCartReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.demo.proto.ProductInfo,
      com.demo.proto.AddCartReply> getBatchDeductMethod() {
    io.grpc.MethodDescriptor<com.demo.proto.ProductInfo, com.demo.proto.AddCartReply> getBatchDeductMethod;
    if ((getBatchDeductMethod = MyServiceGrpc.getBatchDeductMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getBatchDeductMethod = MyServiceGrpc.getBatchDeductMethod) == null) {
          MyServiceGrpc.getBatchDeductMethod = getBatchDeductMethod =
              io.grpc.MethodDescriptor.<com.demo.proto.ProductInfo, com.demo.proto.AddCartReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchDeduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.proto.ProductInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.demo.proto.AddCartReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("BatchDeduct"))
              .build();
        }
      }
    }
    return getBatchDeductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceStub>() {
        @java.lang.Override
        public MyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceStub(channel, callOptions);
        }
      };
    return MyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceBlockingStub>() {
        @java.lang.Override
        public MyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceBlockingStub(channel, callOptions);
        }
      };
    return MyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceFutureStub>() {
        @java.lang.Override
        public MyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceFutureStub(channel, callOptions);
        }
      };
    return MyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * unary call
     * </pre>
     */
    public void sayHello(com.demo.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.demo.proto.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     *server stream
     * </pre>
     */
    public void listOrder(com.demo.proto.Buyer request,
        io.grpc.stub.StreamObserver<com.demo.proto.OrderInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     *client stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.demo.proto.ProductInfo> addToCart(
        io.grpc.stub.StreamObserver<com.demo.proto.AddCartReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAddToCartMethod(), responseObserver);
    }

    /**
     * <pre>
     *double
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.demo.proto.ProductInfo> batchDeduct(
        io.grpc.stub.StreamObserver<com.demo.proto.AddCartReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBatchDeductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.demo.proto.HelloRequest,
                com.demo.proto.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getListOrderMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.demo.proto.Buyer,
                com.demo.proto.OrderInfo>(
                  this, METHODID_LIST_ORDER)))
          .addMethod(
            getAddToCartMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.demo.proto.ProductInfo,
                com.demo.proto.AddCartReply>(
                  this, METHODID_ADD_TO_CART)))
          .addMethod(
            getBatchDeductMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.demo.proto.ProductInfo,
                com.demo.proto.AddCartReply>(
                  this, METHODID_BATCH_DEDUCT)))
          .build();
    }
  }

  /**
   */
  public static final class MyServiceStub extends io.grpc.stub.AbstractAsyncStub<MyServiceStub> {
    private MyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary call
     * </pre>
     */
    public void sayHello(com.demo.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.demo.proto.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server stream
     * </pre>
     */
    public void listOrder(com.demo.proto.Buyer request,
        io.grpc.stub.StreamObserver<com.demo.proto.OrderInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.demo.proto.ProductInfo> addToCart(
        io.grpc.stub.StreamObserver<com.demo.proto.AddCartReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAddToCartMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *double
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.demo.proto.ProductInfo> batchDeduct(
        io.grpc.stub.StreamObserver<com.demo.proto.AddCartReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBatchDeductMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MyServiceBlockingStub> {
    private MyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary call
     * </pre>
     */
    public com.demo.proto.HelloReply sayHello(com.demo.proto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server stream
     * </pre>
     */
    public java.util.Iterator<com.demo.proto.OrderInfo> listOrder(
        com.demo.proto.Buyer request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MyServiceFutureStub> {
    private MyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary call
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.demo.proto.HelloReply> sayHello(
        com.demo.proto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_LIST_ORDER = 1;
  private static final int METHODID_ADD_TO_CART = 2;
  private static final int METHODID_BATCH_DEDUCT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.demo.proto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.demo.proto.HelloReply>) responseObserver);
          break;
        case METHODID_LIST_ORDER:
          serviceImpl.listOrder((com.demo.proto.Buyer) request,
              (io.grpc.stub.StreamObserver<com.demo.proto.OrderInfo>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_TO_CART:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addToCart(
              (io.grpc.stub.StreamObserver<com.demo.proto.AddCartReply>) responseObserver);
        case METHODID_BATCH_DEDUCT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.batchDeduct(
              (io.grpc.stub.StreamObserver<com.demo.proto.AddCartReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.demo.proto.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MyService");
    }
  }

  private static final class MyServiceFileDescriptorSupplier
      extends MyServiceBaseDescriptorSupplier {
    MyServiceFileDescriptorSupplier() {}
  }

  private static final class MyServiceMethodDescriptorSupplier
      extends MyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MyServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getListOrderMethod())
              .addMethod(getAddToCartMethod())
              .addMethod(getBatchDeductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
