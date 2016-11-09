package com.spring.rest;

public class Order {
	
	private int id;
	private String title;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Order(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", title=" + title + ", price=" + price + "]";
	}
	
}
