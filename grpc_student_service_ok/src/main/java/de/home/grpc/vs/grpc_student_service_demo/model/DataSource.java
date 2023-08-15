package de.home.grpc.vs.grpc_student_service_demo.model;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

	private static DataSource instance = null;

	private List<Item> items = new ArrayList<Item>();
	private List<Order> orders = new ArrayList<Order>();
	private List<Customer> customers = new ArrayList<Customer>();
	private List<Itemblock> stocks = new ArrayList<Itemblock>();

	private DataSource() {
	}

	public static DataSource getInstance() {
		if (instance == null) {
			instance = new DataSource();
		}
		return instance;
	}

	public void prefillData() {
		// Items
		createItem(new Item(1, "Brot", "Lebensmittel", 20));
		createItem(new Item(2, "Milch", "Lebensmittel", 10));
		createItem(new Item(3, "Käse", "Lebensmittel", 15));
		createItem(new Item(4, "Cola", "Getränk", 5));
		createItem(new Item(5, "Fanta", "Getränk", 25));
		// Customers
		createCustomer(new Customer(1, "Max Mustermann", "Musterstraße 1", "max@mustermann.de"));
		createCustomer(new Customer(2, "Erika Mustermann", "Musterstraße 2", "erika@mustermann.de"));
		// Stocks
		for (Item i : items) {
			addStock(i, (int) i.getPrice() * 2);
		}
		// Orders
		Order o1 = new Order(0, 1, 0, new ArrayList<Itemblock>());
		o1.addItemblock(new Itemblock(getItemById(1), 1));
		o1.addItemblock(new Itemblock(getItemById(2), 3));
		
		Order o2 = new Order(1, 2, 0, new ArrayList<Itemblock>());
		o2.addItemblock(new Itemblock(getItemById(3), 2));
		o2.addItemblock(new Itemblock(getItemById(4), 5));
		orders.add(o1);
		orders.add(o2);
	}

	//// Output functions
	public List<Item> getItems() {
		return items;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Itemblock> getStocks() {
		return stocks;
	}

	//// Search functions

	// search for an item by id
	public Item getItemById(int id) {
		for (Item i : this.items) {
			if (i.getId() == id)
				return i;
		}
		return null;
	}

	// search for an item by name
	public Item getItemByName(String name) {
		for (Item i : this.items) {
			if (i.getName().equals(name))
				return i;
		}
		return null;
	}

	// search for a customer by id
	public Customer getCustomerById(int id) {
		for (Customer c : this.customers) {
			if (c.getId() == id)
				return c;
		}
		return null;
	}

	// search for a customer by name
	public Customer getCustomerByName(String name) {
		for (Customer c : this.customers) {
			if (c.getName().equals(name))
				return c;
		}
		return null;
	}

	// search for an itemblock by item
	public Itemblock getItemblockByItem(Item item) {
		for (Itemblock ib : this.stocks) {
			if (ib.getItem().equals(item))
				return ib;
		}
		return null;
	}

	// search for an order by id

	public Order getOrderById(int id) {
		for (Order o : this.orders) {
			if (o.getId() == id)
				return o;
		}
		return null;
	}

	//// Manipulation functions

	// add, remove ,edit items
	public void createItem(Item item) {
		items.add(item);
		stocks.add(new Itemblock(item, 0));
	}

	public void removeItem(Item item) {
		items.remove(item);
		stocks.remove(getItemblockByItem(item));
	}

	public void editItem(Item item) {
		for (Item i : this.items) {
			if (i.getId() == item.getId()) {
				i.setName(item.getName());
				i.setPrice(item.getPrice());
				i.setDescription(item.getDescription());
			}
		}
	}

	// add, remove ,edit stocks
	public void addStock(Item item, int amount) {
		Itemblock ib = getItemblockByItem(item);
		ib.setAmount(ib.getAmount() + amount);
	}

	public void removeStock(Item item, int amount) {
		Itemblock ib = getItemblockByItem(item);
		if (ib.getAmount() - amount >= 0) {
			ib.setAmount(ib.getAmount() - amount);
		}
		else {
			ib.setAmount(0);
		}
	}

	public void editStock(Item item, int amount) {
		Itemblock ib = getItemblockByItem(item);
		ib.setAmount(amount);
	}

	// add, remove ,edit customers
	public void createCustomer(Customer customer) {
		customers.add(customer);
	}

	public void removeCustomer(Customer customer) {
		customers.remove(customer);
	}

	public void editCustomer(Customer customer) {
		for (Customer c : this.customers) {
			if (c.getId() == customer.getId()) {
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
			}
		}
	}

	// add, remove ,edit orders
	public void createOrder(Order order) {
		orders.add(order);
	}

	public void removeOrder(Order order) {
		orders.remove(order);
	}

	public void editOrder(Order order) {
		for (Order o : this.orders) {
			if (o.getId() == order.getId()) {
				o.setItemblocks(order.getItemblocks());
			}
		}
	}

}
