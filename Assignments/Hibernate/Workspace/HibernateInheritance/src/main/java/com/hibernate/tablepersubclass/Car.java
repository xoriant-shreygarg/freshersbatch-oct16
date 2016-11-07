package com.hibernate.tablepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CAR")
@PrimaryKeyJoinColumn(name="ID")
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
