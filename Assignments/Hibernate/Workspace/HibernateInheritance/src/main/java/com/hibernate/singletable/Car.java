package com.hibernate.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Car")
public class Car extends Vehicle{
	
	@Column
	private int carValue;

	public int getCarValue() {
		return carValue;
	}

	public void setCarValue(int carValue) {
		this.carValue = carValue;
	}

	public Car(String model, double price, int carValue) {
		super(model, price);
		this.carValue = carValue;
	}

}
