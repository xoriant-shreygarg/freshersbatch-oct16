package com.hibernate.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Bike")
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
