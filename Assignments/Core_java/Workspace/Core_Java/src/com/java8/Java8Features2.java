package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//@FunctionalInterface
//interface SortOrders<T>{
//	boolean check(T t);
//}

enum OrderStatus{ ACCEPTED, COMPLETED }
class Order{
	private int id;
	private String product;
	private int quantity;
	private int price;
	private OrderStatus orderStatus;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getBillAmount() {
		return price;
	}
	public void setBillAmount(int billAmount) {
		this.price = billAmount;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", product=" + product + ", quantity=" + quantity + ", price=" + price
				+ ", orderStatus=" + orderStatus + "]";
	}
	public Order(int id, String product, int quantity, int price, OrderStatus orderStatus) {
		super();
		this.id = id;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
		this.orderStatus = orderStatus;
	}
}	

public class Java8Features2 {

	public static void main(String[] args) {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(1, "Xiaomi Mi Mix", 2, 60000,OrderStatus.ACCEPTED));
		orders.add(new Order(2, "OnePlus 3", 1, 28000,OrderStatus.COMPLETED));
		orders.add(new Order(3, "Meizu m3 note", 2, 25000,OrderStatus.ACCEPTED));
		orders.add(new Order(4, "iPhone 7+", 1, 70000,OrderStatus.COMPLETED));
		System.out.println("\nALL ORDERS\n");
		print(orders);
		System.out.println("\nCOMPLETED ORDERS\n");
//		SortOrders<Order> sortOrdersByStatus = (Order o) -> o.getOrderStatus()==OrderStatus.COMPLETED; 
		Predicate<Order> sortOrdersByStatus = (Order o) -> o.getOrderStatus()==OrderStatus.COMPLETED;
		print(filter(orders,sortOrdersByStatus));
		System.out.println("\nORDERS WITH PRICE > 50000\n");
//		SortOrders<Order> sortOrdersByPrice = (Order o) -> o.getPrice()>50000;
		Predicate<Order> sortOrdersByPrice = (Order o) ->  o.getPrice()>50000;
		print(filter(orders,sortOrdersByPrice));
	}

//	private static List<Order> filter(List<Order> orders, SortOrders<Order> sortOrders) {
//		List<Order> sortedList = new ArrayList<>();
//		for(Order order: orders)
//			if(sortOrders.check(order))
//				sortedList.add(order);
//		return sortedList;
//	}

	private static List<Order> filter(List<Order> orders, Predicate<Order> sortOrders) {
		List<Order> sortedList = new ArrayList<>();
		for(Order order: orders)
			if(sortOrders.test(order))
				sortedList.add(order);
		return sortedList;
	}

	
	private static void print(List<Order> orders) {
		for(Order order : orders)
			System.out.println(order);
	}
}
