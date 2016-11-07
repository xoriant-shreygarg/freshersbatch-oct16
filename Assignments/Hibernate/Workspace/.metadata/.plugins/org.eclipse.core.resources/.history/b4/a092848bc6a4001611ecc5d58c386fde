package com.hibernate.tableperclass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CAR")
@AttributeOverrides({  
    @AttributeOverride(name="vehicleId", column=@Column(name="id")),  
    @AttributeOverride(name="model", column=@Column(name="model")),  
    @AttributeOverride(name="price", column=@Column(name="price"))  
})
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
