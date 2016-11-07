package com.hibernate.tablepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="BIKE")
@PrimaryKeyJoinColumn(name="ID")
public class Bike extends Vehicle{
	
	@Column
	private int bikeValue;

	public int getBikeValue() {
		return bikeValue;
	}

	public void setBikeValue(int bikeValue) {
		this.bikeValue = bikeValue;
	}

	public Bike(String model, double price, int bikeValue) {
		super(model, price);
		this.bikeValue = bikeValue;
	}

}
