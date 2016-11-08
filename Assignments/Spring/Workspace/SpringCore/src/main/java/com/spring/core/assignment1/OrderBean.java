package com.spring.core.assignment1;

public class OrderBean {

	private String name;
	private ItemBean item;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ItemBean getItem() {
		return item;
	}

	public void setItem(ItemBean item) {
		this.item = item;
	}

	public OrderBean(String name, ItemBean item) {
		super();
		this.name = name;
		this.item = item;
	}

	public OrderBean() {
		super();
	}

	@Override
	public String toString() {
		return "Order [name=" + name + ", item=" + item + "]";
	}

}
