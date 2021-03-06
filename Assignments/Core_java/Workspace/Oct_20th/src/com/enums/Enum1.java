package com.enums;

enum Status{
	NEW(0), REJECTED(1), ACCEPTED(2), COMPLETED(3);
	
	private int value;
	
	Status(int value){
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public static void printhello(){
		System.out.println("Hello");
	}
	
}

class Order{
	private int id;
	private Status status;
	private String name;
	private int quantity;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + ", status value=" + this.status.getValue() + ", name=" + name + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	public Order(int id, Status status, String name, int quantity, int price) {
		super();
		this.id = id;
		this.status = status;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	
}

public class Enum1 {

	public static void main(String[] args) {
//		Order o1 = new Order(1, Status.NEW, "Phone", 2, 20000);
//		System.out.println(o1);
	}

}
