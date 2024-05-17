package com.osmel.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: ebank.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmel.stubs.Ebank.ConvertCurrencyRequest,
      com.osmel.stubs.Ebank.ConvertCurrencyResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = com.osmel.stubs.Ebank.ConvertCurrencyRequest.class,
      responseType = com.osmel.stubs.Ebank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmel.stubs.Ebank.ConvertCurrencyRequest,
      com.osmel.stubs.Ebank.ConvertCurrencyResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<com.osmel.stubs.Ebank.ConvertCurrencyRequest, com.osmel.stubs.Ebank.ConvertCurrencyResponse> getConvertMethod;
    if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
          BankServiceGrpc.getConvertMethod = getConvertMethod =
              io.grpc.MethodDescriptor.<com.osmel.stubs.Ebank.ConvertCurrencyRequest, com.osmel.stubs.Ebank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmel.stubs.Ebank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmel.stubs.Ebank.ConvertCurrencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convert"))
              .build();
        }
      }
    }
    return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmel.stubs.Ebank.ConvertCurrencyRequest,
      com.osmel.stubs.Ebank.ConvertCurrencyResponse> getPerformStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "performStream",
      requestType = com.osmel.stubs.Ebank.ConvertCurrencyRequest.class,
      responseType = com.osmel.stubs.Ebank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.osmel.stubs.Ebank.ConvertCurrencyRequest,
      com.osmel.stubs.Ebank.ConvertCurrencyResponse> getPerformStreamMethod() {
    io.grpc.MethodDescriptor<com.osmel.stubs.Ebank.ConvertCurrencyRequest, com.osmel.stubs.Ebank.ConvertCurrencyResponse> getPerformStreamMethod;
    if ((getPerformStreamMethod = BankServiceGrpc.getPerformStreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getPerformStreamMethod = BankServiceGrpc.getPerformStreamMethod) == null) {
          BankServiceGrpc.getPerformStreamMethod = getPerformStreamMethod =
              io.grpc.MethodDescriptor.<com.osmel.stubs.Ebank.ConvertCurrencyRequest, com.osmel.stubs.Ebank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "performStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmel.stubs.Ebank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmel.stubs.Ebank.ConvertCurrencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("performStream"))
              .build();
        }
      }
    }
    return getPerformStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmel.stubs.Ebank.ConvertCurrencyRequest,
      com.osmel.stubs.Ebank.ConvertCurrencyResponse> getGetStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStream",
      requestType = com.osmel.stubs.Ebank.ConvertCurrencyRequest.class,
      responseType = com.osmel.stubs.Ebank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.osmel.stubs.Ebank.ConvertCurrencyRequest,
      com.osmel.stubs.Ebank.ConvertCurrencyResponse> getGetStreamMethod() {
    io.grpc.MethodDescriptor<com.osmel.stubs.Ebank.ConvertCurrencyRequest, com.osmel.stubs.Ebank.ConvertCurrencyResponse> getGetStreamMethod;
    if ((getGetStreamMethod = BankServiceGrpc.getGetStreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetStreamMethod = BankServiceGrpc.getGetStreamMethod) == null) {
          BankServiceGrpc.getGetStreamMethod = getGetStreamMethod =
              io.grpc.MethodDescriptor.<com.osmel.stubs.Ebank.ConvertCurrencyRequest, com.osmel.stubs.Ebank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmel.stubs.Ebank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmel.stubs.Ebank.ConvertCurrencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getStream"))
              .build();
        }
      }
    }
    return getGetStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmel.stubs.Ebank.ConvertCurrencyRequest,
      com.osmel.stubs.Ebank.ConvertCurrencyResponse> getFullStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fullStream",
      requestType = com.osmel.stubs.Ebank.ConvertCurrencyRequest.class,
      responseType = com.osmel.stubs.Ebank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.osmel.stubs.Ebank.ConvertCurrencyRequest,
      com.osmel.stubs.Ebank.ConvertCurrencyResponse> getFullStreamMethod() {
    io.grpc.MethodDescriptor<com.osmel.stubs.Ebank.ConvertCurrencyRequest, com.osmel.stubs.Ebank.ConvertCurrencyResponse> getFullStreamMethod;
    if ((getFullStreamMethod = BankServiceGrpc.getFullStreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getFullStreamMethod = BankServiceGrpc.getFullStreamMethod) == null) {
          BankServiceGrpc.getFullStreamMethod = getFullStreamMethod =
              io.grpc.MethodDescriptor.<com.osmel.stubs.Ebank.ConvertCurrencyRequest, com.osmel.stubs.Ebank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fullStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmel.stubs.Ebank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmel.stubs.Ebank.ConvertCurrencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("fullStream"))
              .build();
        }
      }
    }
    return getFullStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceStub>() {
        @java.lang.Override
        public BankServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceStub(channel, callOptions);
        }
      };
    return BankServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub>() {
        @java.lang.Override
        public BankServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceBlockingStub(channel, callOptions);
        }
      };
    return BankServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub>() {
        @java.lang.Override
        public BankServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceFutureStub(channel, callOptions);
        }
      };
    return BankServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void convert(com.osmel.stubs.Ebank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyRequest> performStream(
        io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPerformStreamMethod(), responseObserver);
    }

    /**
     */
    default void getStream(com.osmel.stubs.Ebank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStreamMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyRequest> fullStream(
        io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getFullStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BankService.
   */
  public static abstract class BankServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BankServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BankService.
   */
  public static final class BankServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BankServiceStub> {
    private BankServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     */
    public void convert(com.osmel.stubs.Ebank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyRequest> performStream(
        io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getPerformStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getStream(com.osmel.stubs.Ebank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyRequest> fullStream(
        io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getFullStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BankService.
   */
  public static final class BankServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.osmel.stubs.Ebank.ConvertCurrencyResponse convert(com.osmel.stubs.Ebank.ConvertCurrencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.osmel.stubs.Ebank.ConvertCurrencyResponse> getStream(
        com.osmel.stubs.Ebank.ConvertCurrencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BankService.
   */
  public static final class BankServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BankServiceFutureStub> {
    private BankServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmel.stubs.Ebank.ConvertCurrencyResponse> convert(
        com.osmel.stubs.Ebank.ConvertCurrencyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_STREAM = 1;
  private static final int METHODID_PERFORM_STREAM = 2;
  private static final int METHODID_FULL_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((com.osmel.stubs.Ebank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_STREAM:
          serviceImpl.getStream((com.osmel.stubs.Ebank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyResponse>) responseObserver);
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
        case METHODID_PERFORM_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.performStream(
              (io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyResponse>) responseObserver);
        case METHODID_FULL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullStream(
              (io.grpc.stub.StreamObserver<com.osmel.stubs.Ebank.ConvertCurrencyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getConvertMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmel.stubs.Ebank.ConvertCurrencyRequest,
              com.osmel.stubs.Ebank.ConvertCurrencyResponse>(
                service, METHODID_CONVERT)))
        .addMethod(
          getPerformStreamMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.osmel.stubs.Ebank.ConvertCurrencyRequest,
              com.osmel.stubs.Ebank.ConvertCurrencyResponse>(
                service, METHODID_PERFORM_STREAM)))
        .addMethod(
          getGetStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.osmel.stubs.Ebank.ConvertCurrencyRequest,
              com.osmel.stubs.Ebank.ConvertCurrencyResponse>(
                service, METHODID_GET_STREAM)))
        .addMethod(
          getFullStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.osmel.stubs.Ebank.ConvertCurrencyRequest,
              com.osmel.stubs.Ebank.ConvertCurrencyResponse>(
                service, METHODID_FULL_STREAM)))
        .build();
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmel.stubs.Ebank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BankServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getPerformStreamMethod())
              .addMethod(getGetStreamMethod())
              .addMethod(getFullStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
