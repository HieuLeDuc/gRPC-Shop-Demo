package de.home.grpc.vs.grpc_student_client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import de.home.grpc.vs.grpc_student_client.model.Item;
import de.home.grpc.vs.grpc_student_client.model.Itemblock;
import de.home.grpc.vs.stubs.*;
import de.home.grpc.vs.stubs.StoreServiceGrpc.StoreServiceBlockingStub;
import de.home.grpc.vs.stubs.StoreServiceOuterClass.Empty;
import de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemInitRequest;
import de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemListResponse;
import de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemRequest;
import de.home.grpc.vs.stubs.StoreServiceOuterClass.ItemResponse;
import de.home.grpc.vs.stubs.StoreServiceOuterClass.Itemblock_Proto;
import de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderAddItemRequest;
import de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderInitRequest;
import de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderListResponse;
import de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderRequest;
import de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponse;
import de.home.grpc.vs.stubs.StoreServiceOuterClass.OrderResponseSimple;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClientApp {

	public static void main(String[] args) {
		System.out.println("Running gRPC Store client");

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
		StoreServiceBlockingStub storeServiceStub = StoreServiceGrpc.newBlockingStub(channel);
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			boolean finish = false;
			while (!finish) {
				System.out.println(
						"\r\nEnter operation code \n1: query an item;\n 2: query all items;\n 3: query an order;\n 4: query all orders;\n 5: create an item;\n 6: create an order;\n 7: add an item and amount to an order;\n 0: exit");
				Integer opr = scanner.nextInt();
				switch (opr) {
					case 1:
						// Query an item
						System.out.println("Enter item id:");
						String existingItemid = scanner.next();
						try {
							ItemRequest itemRequest = ItemRequest.newBuilder().setId(Integer.parseInt(existingItemid))
									.build();
							ItemResponse itemResponse = storeServiceStub.getItem(itemRequest);
							displayItem(itemResponse);
						} catch (Exception e) {
							System.err.println("ERROR:" + e.getLocalizedMessage());
						}

						break;
					case 2:
						// Query all items
						Empty empty = Empty.newBuilder().build();
						ItemListResponse itemListResponse = storeServiceStub.getAllItems(empty);
						for (int i = 0; i < itemListResponse.getItemsCount(); i++) {
							System.out.println("==================================");
							displayItem(itemListResponse.getItems(i));
						}
						break;
					case 3:
						// Query an order, detailed view
						System.out.println("Enter order id:");
						String existingOrderid = scanner.next();
						try {
							OrderRequest orderRequest = OrderRequest.newBuilder()
									.setId(Integer.parseInt(existingOrderid)).build();
							OrderResponse orderResponse = storeServiceStub.getOrder(orderRequest);
							System.out.println("Order ID: " + orderResponse.getId());
							System.out.println("Order Customer ID: " + orderResponse.getCustomerid());
							System.out.println("Order Total: " + orderResponse.getTotal());
							for (int i = 0; i < orderResponse.getItemblocksCount(); i++) {
								System.out.println("==================================");
								System.out.println("Item ID: " + orderResponse.getItemblocks(i).getItemId());
								System.out.println("Item Amount: " + orderResponse.getItemblocks(i).getAmount());
							}
						} catch (Exception e) {
							System.err.println("ERROR:" + e.getLocalizedMessage());
						}
						break;
					case 4:
						// Query all orders, simplified view
						Empty empty2 = Empty.newBuilder().build();
						OrderListResponse orderListResponse = storeServiceStub.getAllOrders(empty2);
						for (int i = 0; i < orderListResponse.getOrdersCount(); i++) {
							System.out.println("==================================");
							displayOrderSimple(orderListResponse.getOrders(i));
						}
						break;
					case 5:
						// Create new item
						try{
						scanner.nextLine();
						System.out.println("Enter item name:");
						String name = scanner.nextLine();
						System.out.println("Enter item description:");
						String description = scanner.nextLine();
						System.out.println("Enter item price:");
						Double price = Double.parseDouble(scanner.nextLine());
						ItemInitRequest initRequest = ItemInitRequest.newBuilder().setName(name)
								.setDescription(description).setPrice(price).build();
						ItemResponse itemResponse = storeServiceStub.createItem(initRequest);
						displayItem(itemResponse);
						}
						catch(Exception e){
							System.err.println("ERROR:" + e.getLocalizedMessage());
						}
						break;
					case 6:
						// Create new order
						try{
						System.out.println("Enter customer id:");
						int customerid = scanner.nextInt();
						List<Itemblock> itemblocks = new ArrayList<Itemblock>();
						Boolean exit = false;
						while(!exit)
						{
							System.out.println("Enter item id:");
							int itemid = scanner.nextInt();
							System.out.println("Enter amount:");
							int amount = scanner.nextInt();
							Itemblock itemblock = new Itemblock(new Item(itemid, "", "", 0), amount);
							itemblocks.add(itemblock);
							System.out.println("Add another item? (y/n)");
							if (scanner.next().equals("n"))
								exit = true;

						}
						OrderInitRequest.Builder orderInitRequestBuilder = OrderInitRequest.newBuilder().setCustomerid(customerid);
						for(Itemblock itemblock : itemblocks)
						{
							orderInitRequestBuilder.addItemblocks(Itemblock_Proto.newBuilder().setItemId(itemblock.getItem().getId()).setAmount(itemblock.getAmount()));
						}
						OrderInitRequest orderInitRequest = orderInitRequestBuilder.build();
						OrderResponseSimple orderResponseSimple = storeServiceStub.createOrder(orderInitRequest);
						displayOrderSimple(orderResponseSimple);
						}
						catch(Exception e){
							System.err.println("ERROR:" + e.getLocalizedMessage());
						}
						break;
					case 7:
						// Add item to order
						try{
						System.out.println("Enter order id:");
						int orderid = scanner.nextInt();
						System.out.println("Enter item id:");
						int itemid = scanner.nextInt();
						System.out.println("Enter amount:");
						int amount = scanner.nextInt();
						OrderAddItemRequest orderAddItemRequest = OrderAddItemRequest.newBuilder().setOrderid(orderid)
								.setItemid(itemid).setAmount(amount).build();
						OrderResponse orderResponse = storeServiceStub.addItemToOrder(orderAddItemRequest);
						System.out.println("Order ID: " + orderResponse.getId());
						System.out.println("Order Total: " + orderResponse.getTotal());
						for (int i = 0; i < orderResponse.getItemblocksCount(); i++) {
							System.out.println("==================================");
							System.out.println("Item ID: " + orderResponse.getItemblocks(i).getItemId());
							System.out.println("Item Amount: " + orderResponse.getItemblocks(i).getAmount());
						}
						}
						catch(Exception e){
							System.err.println("ERROR:" + e.getLocalizedMessage());
						}
						break;
					default:
						finish = true;
						break;
				}
			}
		} finally {
			if (scanner != null)
				scanner.close();
		}

		try {
			channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void displayItem(ItemResponse itemResponse) {
		System.out.println("Item ID: " + itemResponse.getId());
		System.out.println("Item Name: " + itemResponse.getName());
		System.out.println("Item Description: " + itemResponse.getDescription());
		System.out.println("Item Price: " + itemResponse.getPrice());
	}

	public static void displayOrderSimple(OrderResponseSimple orderResponseSimple) {
		System.out.println("Order ID: " + orderResponseSimple.getId());
		System.out.println("Order Customer ID: " + orderResponseSimple.getCustomerid());
		System.out.println("Order Total: " + orderResponseSimple.getTotal());
	}
}
