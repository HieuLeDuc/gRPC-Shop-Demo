package de.home.grpc.vs.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * two methods: for fetching all students and fetching a specific student based on a student-ID 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: store-service.proto")
public final class StoreServiceGrpc {

  private StoreServiceGrpc() {}

  public static final String SERVICE_NAME = "StoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemRequest,
      de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse> getGetItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getItem",
      requestType = de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemRequest.class,
      responseType = de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemRequest,
      de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse> getGetItemMethod() {
    io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemRequest, de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse> getGetItemMethod;
    if ((getGetItemMethod = StoreServiceGrpc.getGetItemMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getGetItemMethod = StoreServiceGrpc.getGetItemMethod) == null) {
          StoreServiceGrpc.getGetItemMethod = getGetItemMethod = 
              io.grpc.MethodDescriptor.<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemRequest, de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StoreService", "getItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("getItem"))
                  .build();
          }
        }
     }
     return getGetItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty,
      de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemListResponse> getGetAllItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllItems",
      requestType = de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty.class,
      responseType = de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty,
      de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemListResponse> getGetAllItemsMethod() {
    io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty, de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemListResponse> getGetAllItemsMethod;
    if ((getGetAllItemsMethod = StoreServiceGrpc.getGetAllItemsMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getGetAllItemsMethod = StoreServiceGrpc.getGetAllItemsMethod) == null) {
          StoreServiceGrpc.getGetAllItemsMethod = getGetAllItemsMethod = 
              io.grpc.MethodDescriptor.<de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty, de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StoreService", "getAllItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("getAllItems"))
                  .build();
          }
        }
     }
     return getGetAllItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemInitRequest,
      de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse> getCreateItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createItem",
      requestType = de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemInitRequest.class,
      responseType = de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemInitRequest,
      de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse> getCreateItemMethod() {
    io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemInitRequest, de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse> getCreateItemMethod;
    if ((getCreateItemMethod = StoreServiceGrpc.getCreateItemMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getCreateItemMethod = StoreServiceGrpc.getCreateItemMethod) == null) {
          StoreServiceGrpc.getCreateItemMethod = getCreateItemMethod = 
              io.grpc.MethodDescriptor.<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemInitRequest, de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StoreService", "createItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemInitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("createItem"))
                  .build();
          }
        }
     }
     return getCreateItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderRequest,
      de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse> getGetOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOrder",
      requestType = de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderRequest.class,
      responseType = de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderRequest,
      de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse> getGetOrderMethod() {
    io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderRequest, de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse> getGetOrderMethod;
    if ((getGetOrderMethod = StoreServiceGrpc.getGetOrderMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getGetOrderMethod = StoreServiceGrpc.getGetOrderMethod) == null) {
          StoreServiceGrpc.getGetOrderMethod = getGetOrderMethod = 
              io.grpc.MethodDescriptor.<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderRequest, de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StoreService", "getOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("getOrder"))
                  .build();
          }
        }
     }
     return getGetOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty,
      de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderListResponse> getGetAllOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllOrders",
      requestType = de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty.class,
      responseType = de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty,
      de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderListResponse> getGetAllOrdersMethod() {
    io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty, de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderListResponse> getGetAllOrdersMethod;
    if ((getGetAllOrdersMethod = StoreServiceGrpc.getGetAllOrdersMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getGetAllOrdersMethod = StoreServiceGrpc.getGetAllOrdersMethod) == null) {
          StoreServiceGrpc.getGetAllOrdersMethod = getGetAllOrdersMethod = 
              io.grpc.MethodDescriptor.<de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty, de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StoreService", "getAllOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("getAllOrders"))
                  .build();
          }
        }
     }
     return getGetAllOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderInitRequest,
      de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponseSimple> getCreateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createOrder",
      requestType = de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderInitRequest.class,
      responseType = de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponseSimple.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderInitRequest,
      de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponseSimple> getCreateOrderMethod() {
    io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderInitRequest, de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponseSimple> getCreateOrderMethod;
    if ((getCreateOrderMethod = StoreServiceGrpc.getCreateOrderMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getCreateOrderMethod = StoreServiceGrpc.getCreateOrderMethod) == null) {
          StoreServiceGrpc.getCreateOrderMethod = getCreateOrderMethod = 
              io.grpc.MethodDescriptor.<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderInitRequest, de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponseSimple>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StoreService", "createOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderInitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponseSimple.getDefaultInstance()))
                  .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("createOrder"))
                  .build();
          }
        }
     }
     return getCreateOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderAddItemRequest,
      de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse> getAddItemToOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addItemToOrder",
      requestType = de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderAddItemRequest.class,
      responseType = de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderAddItemRequest,
      de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse> getAddItemToOrderMethod() {
    io.grpc.MethodDescriptor<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderAddItemRequest, de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse> getAddItemToOrderMethod;
    if ((getAddItemToOrderMethod = StoreServiceGrpc.getAddItemToOrderMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getAddItemToOrderMethod = StoreServiceGrpc.getAddItemToOrderMethod) == null) {
          StoreServiceGrpc.getAddItemToOrderMethod = getAddItemToOrderMethod = 
              io.grpc.MethodDescriptor.<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderAddItemRequest, de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StoreService", "addItemToOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderAddItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("addItemToOrder"))
                  .build();
          }
        }
     }
     return getAddItemToOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StoreServiceStub newStub(io.grpc.Channel channel) {
    return new StoreServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StoreServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StoreServiceFutureStub(channel);
  }

  /**
   * <pre>
   * two methods: for fetching all students and fetching a specific student based on a student-ID 
   * </pre>
   */
  public static abstract class StoreServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getItem(de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemRequest request,
        io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetItemMethod(), responseObserver);
    }

    /**
     */
    public void getAllItems(de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllItemsMethod(), responseObserver);
    }

    /**
     */
    public void createItem(de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemInitRequest request,
        io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateItemMethod(), responseObserver);
    }

    /**
     */
    public void getOrder(de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderRequest request,
        io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrderMethod(), responseObserver);
    }

    /**
     */
    public void getAllOrders(de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllOrdersMethod(), responseObserver);
    }

    /**
     */
    public void createOrder(de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderInitRequest request,
        io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponseSimple> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateOrderMethod(), responseObserver);
    }

    /**
     */
    public void addItemToOrder(de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderAddItemRequest request,
        io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddItemToOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemRequest,
                de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse>(
                  this, METHODID_GET_ITEM)))
          .addMethod(
            getGetAllItemsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty,
                de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemListResponse>(
                  this, METHODID_GET_ALL_ITEMS)))
          .addMethod(
            getCreateItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemInitRequest,
                de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse>(
                  this, METHODID_CREATE_ITEM)))
          .addMethod(
            getGetOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderRequest,
                de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse>(
                  this, METHODID_GET_ORDER)))
          .addMethod(
            getGetAllOrdersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty,
                de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderListResponse>(
                  this, METHODID_GET_ALL_ORDERS)))
          .addMethod(
            getCreateOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderInitRequest,
                de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponseSimple>(
                  this, METHODID_CREATE_ORDER)))
          .addMethod(
            getAddItemToOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderAddItemRequest,
                de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse>(
                  this, METHODID_ADD_ITEM_TO_ORDER)))
          .build();
    }
  }

  /**
   * <pre>
   * two methods: for fetching all students and fetching a specific student based on a student-ID 
   * </pre>
   */
  public static final class StoreServiceStub extends io.grpc.stub.AbstractStub<StoreServiceStub> {
    private StoreServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StoreServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StoreServiceStub(channel, callOptions);
    }

    /**
     */
    public void getItem(de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemRequest request,
        io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllItems(de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createItem(de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemInitRequest request,
        io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrder(de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderRequest request,
        io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllOrders(de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOrder(de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderInitRequest request,
        io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponseSimple> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addItemToOrder(de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderAddItemRequest request,
        io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddItemToOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * two methods: for fetching all students and fetching a specific student based on a student-ID 
   * </pre>
   */
  public static final class StoreServiceBlockingStub extends io.grpc.stub.AbstractStub<StoreServiceBlockingStub> {
    private StoreServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StoreServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StoreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse getItem(de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemListResponse getAllItems(de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllItemsMethod(), getCallOptions(), request);
    }

    /**
     */
    public de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse createItem(de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemInitRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse getOrder(de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderListResponse getAllOrders(de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllOrdersMethod(), getCallOptions(), request);
    }

    /**
     */
    public de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponseSimple createOrder(de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderInitRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse addItemToOrder(de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderAddItemRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddItemToOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * two methods: for fetching all students and fetching a specific student based on a student-ID 
   * </pre>
   */
  public static final class StoreServiceFutureStub extends io.grpc.stub.AbstractStub<StoreServiceFutureStub> {
    private StoreServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StoreServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StoreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse> getItem(
        de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemListResponse> getAllItems(
        de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllItemsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse> createItem(
        de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemInitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse> getOrder(
        de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderListResponse> getAllOrders(
        de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllOrdersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponseSimple> createOrder(
        de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderInitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse> addItemToOrder(
        de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderAddItemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddItemToOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ITEM = 0;
  private static final int METHODID_GET_ALL_ITEMS = 1;
  private static final int METHODID_CREATE_ITEM = 2;
  private static final int METHODID_GET_ORDER = 3;
  private static final int METHODID_GET_ALL_ORDERS = 4;
  private static final int METHODID_CREATE_ORDER = 5;
  private static final int METHODID_ADD_ITEM_TO_ORDER = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StoreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StoreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ITEM:
          serviceImpl.getItem((de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemRequest) request,
              (io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_ITEMS:
          serviceImpl.getAllItems((de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemListResponse>) responseObserver);
          break;
        case METHODID_CREATE_ITEM:
          serviceImpl.createItem((de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemInitRequest) request,
              (io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse>) responseObserver);
          break;
        case METHODID_GET_ORDER:
          serviceImpl.getOrder((de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderRequest) request,
              (io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_ORDERS:
          serviceImpl.getAllOrders((de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderListResponse>) responseObserver);
          break;
        case METHODID_CREATE_ORDER:
          serviceImpl.createOrder((de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderInitRequest) request,
              (io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponseSimple>) responseObserver);
          break;
        case METHODID_ADD_ITEM_TO_ORDER:
          serviceImpl.addItemToOrder((de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderAddItemRequest) request,
              (io.grpc.stub.StreamObserver<de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return de.home.grpc.vs.stubs.StoreServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StoreService");
    }
  }

  private static final class StoreServiceFileDescriptorSupplier
      extends StoreServiceBaseDescriptorSupplier {
    StoreServiceFileDescriptorSupplier() {}
  }

  private static final class StoreServiceMethodDescriptorSupplier
      extends StoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StoreServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StoreServiceFileDescriptorSupplier())
              .addMethod(getGetItemMethod())
              .addMethod(getGetAllItemsMethod())
              .addMethod(getCreateItemMethod())
              .addMethod(getGetOrderMethod())
              .addMethod(getGetAllOrdersMethod())
              .addMethod(getCreateOrderMethod())
              .addMethod(getAddItemToOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
