package com.hibernate.inheritance.tablepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="LABOUR")
@PrimaryKeyJoinColumn(name="ID")
public class Labour extends Employee {

	@Column
	private double overtime;

	public Labour(String name, double sal, double overtime) {
		super(name, sal);
		this.overtime = overtime;
	}

	public double getOvertime() {
		return overtime;
	}

	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}
	
}
