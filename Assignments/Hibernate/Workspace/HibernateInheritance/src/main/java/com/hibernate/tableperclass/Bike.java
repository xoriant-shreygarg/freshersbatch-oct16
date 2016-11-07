package com.hibernate.tableperclass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BIKE")
@AttributeOverrides({  
    @AttributeOverride(name="vehicleId", column=@Column(name="id")),  
    @AttributeOverride(name="model", column=@Column(name="model")),  
    @AttributeOverride(name="price", column=@Column(name="price"))  
})
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