package de.home.grpc.vs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import de.home.grpc.vs.grpc_student_service_demo.model.*;
import de.home.grpc.vs.grpc_student_service_demo.model.Itemblock;
import de.home.grpc.vs.stubs.StoreServiceGrpc.*;
import de.home.grpc.vs.stubs.StoreServiceOuterClass.*;
import io.grpc.protobuf.StatusProto;
import io.grpc.stub.StreamObserver;

public class StoreService extends StoreServiceImplBase {

    public static int uniqueIDGenerator() {
        return new Random().nextInt(100000000);
    }

    @Override
    public void getItem(ItemRequest request, StreamObserver<ItemResponse> responseObserver) {
        int itemID = request.getId();
        System.out.println("received request for item: " + itemID);
        try {
            Item item = DataSource.getInstance().getItemById(itemID);
            if (item != null) {
                ItemResponse.Builder itemBuilder = ItemResponse.newBuilder();
                ItemResponse itemResponse = itemBuilder.setId(item.getId())
                        .setName(item.getName())
                        .setPrice(item.getPrice())
                        .setDescription(item.getDescription())
                        .build();
                responseObserver.onNext(itemResponse);
                responseObserver.onCompleted();
            } else {
                com.google.rpc.Status status = com.google.rpc.Status.newBuilder()
                        .setCode(com.google.rpc.Code.NOT_FOUND.getNumber())
                        .setMessage("Item ID not found")
                        .build();
                responseObserver.onError(StatusProto.toStatusRuntimeException(status));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void getAllItems(Empty request, StreamObserver<ItemListResponse> responseObserver) {
        System.out.println("received request for all items");
        try {
            ItemListResponse.Builder itemsBuilder = ItemListResponse.newBuilder();
            ItemResponse.Builder itemBuilder = ItemResponse.newBuilder();
            ItemResponse itemResponse = null;

            /* add multiple items entries to itemsBuilder */
            for (Item i : DataSource.getInstance().getItems()) {
                itemResponse = itemBuilder.setId(i.getId())
                        .setName(i.getName())
                        .setPrice(i.getPrice())
                        .setDescription(i.getDescription())
                        .build();
                itemsBuilder.addItems(itemResponse);
            }
            ItemListResponse itemsResponse = itemsBuilder.build();
            responseObserver.onNext(itemsResponse);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void createItem(ItemInitRequest request, StreamObserver<ItemResponse> responseObserver) {
        System.out.println("received request to create item");
        try {
            Item item = new Item(uniqueIDGenerator(), request.getName(), request.getDescription(), request.getPrice());
            DataSource.getInstance().createItem(item);
            ItemResponse.Builder itemBuilder = ItemResponse.newBuilder();
            ItemResponse itemResponse = itemBuilder.setId(item.getId())
                    .setName(item.getName())
                    .setPrice(item.getPrice())
                    .setDescription(item.getDescription())
                    .build();
            responseObserver.onNext(itemResponse);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getOrder(OrderRequest request, StreamObserver<OrderResponse> responseObserver) {
        int orderID = request.getId();
        System.out.println("received request for order: " + orderID);
        try {
            Order order = DataSource.getInstance().getOrderById(orderID);
            if (order != null) {
                OrderResponse.Builder orderBuilder = OrderResponse.newBuilder();
                List<Itemblock> itemblocks = order.getItemblocks();
                for (Itemblock itemblock : itemblocks) {
                    orderBuilder.addItemblocks(Itemblock_Proto.newBuilder()
                            .setItemId(itemblock.getItem().getId())
                            .setAmount(itemblock.getAmount()));
                }
                OrderResponse orderResponse = orderBuilder.setId(order.getId())
                        .setCustomerid(order.getCustomerid())
                        .setTotal(order.getTotal())
                        .build();
                responseObserver.onNext(orderResponse);
                responseObserver.onCompleted();
            } else {
                com.google.rpc.Status status = com.google.rpc.Status.newBuilder()
                        .setCode(com.google.rpc.Code.NOT_FOUND.getNumber())
                        .setMessage("Order ID not found")
                        .build();
                responseObserver.onError(StatusProto.toStatusRuntimeException(status));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getAllOrders(Empty request, StreamObserver<OrderListResponse> responseObserver) {
        System.out.println("received request for all orders");
        try {
            OrderListResponse.Builder ordersBuilder = OrderListResponse.newBuilder();
            OrderResponseSimple.Builder orderSimpleBuilder = OrderResponseSimple.newBuilder();
            OrderResponseSimple orderSimpleResponse = null;

            /* add multiple orders entries to ordersBuilder */
            for (Order o : DataSource.getInstance().getOrders()) {
                orderSimpleResponse = orderSimpleBuilder.setId(o.getId())
                        .setCustomerid(o.getCustomerid())
                        .setTotal(o.getTotal())
                        .build();
                ordersBuilder.addOrders(orderSimpleResponse);
            }
            OrderListResponse ordersResponse = ordersBuilder.build();
            responseObserver.onNext(ordersResponse);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createOrder(OrderInitRequest request, StreamObserver<OrderResponseSimple> responseObserver) {
        System.out.println("received request to create order");
        try {
            List<Itemblock> itemblockList = new ArrayList<Itemblock>();
            Order order = new Order(uniqueIDGenerator(), request.getCustomerid(), (float) 0, itemblockList);
            DataSource.getInstance().createOrder(order);
            for(int i = 0; i < request.getItemblocksCount(); i++)
            {
                Item item = DataSource.getInstance().getItemById(request.getItemblocks(i).getItemId());
                if(item != null)
                {
                    order.addItemblock(new Itemblock(item, request.getItemblocks(i).getAmount()));
                }
            }
            OrderResponseSimple.Builder orderSimpleBuilder = OrderResponseSimple.newBuilder();
            
            OrderResponseSimple orderSimpleResponse = orderSimpleBuilder.setId(order.getId())
                    .setCustomerid(order.getCustomerid())
                    .setTotal(order.getTotal())
                    .build();
            responseObserver.onNext(orderSimpleResponse);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addItemToOrder(OrderAddItemRequest request, StreamObserver<OrderResponse> responseObserver) {
        System.out.println("received request to add item to order");
        try {
            Order order = DataSource.getInstance().getOrderById(request.getOrderid());
            Item item = DataSource.getInstance().getItemById(request.getItemid());
            if (order != null && item != null) {
                DataSource.getInstance().getOrderById(request.getOrderid())
                        .addItemblock(new Itemblock(item, request.getAmount()));
                OrderResponse.Builder orderBuilder = OrderResponse.newBuilder();
                List<Itemblock> itemblocks = order.getItemblocks();
                for (Itemblock itemblock : itemblocks) {
                    orderBuilder.addItemblocks(Itemblock_Proto.newBuilder()
                            .setItemId(itemblock.getItem().getId())
                            .setAmount(itemblock.getAmount()));
                }
                OrderResponse orderResponse = orderBuilder.setId(order.getId())
                        .setCustomerid(order.getCustomerid())
                        .setTotal(order.getTotal())
                        .build();
                responseObserver.onNext(orderResponse);
                responseObserver.onCompleted();
            } else {
                com.google.rpc.Status status = com.google.rpc.Status.newBuilder()
                        .setCode(com.google.rpc.Code.NOT_FOUND.getNumber())
                        .setMessage("Order ID or Item ID not found")
                        .build();
                responseObserver.onError(StatusProto.toStatusRuntimeException(status));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
