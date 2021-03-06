package com.collections;

import java.util.*;

class Employee{
	private int number;
	public Employee(int number) {
		super();
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

public class Collections5 {

	public static void main(String[] args) {
		Map<Employee, String> hashMap = new HashMap<>();
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(2);
		Employee e3 = new Employee(3);
		Employee e4 = new Employee(4);
		hashMap.put(e1, "A");
		hashMap.put(e2, "B");
		hashMap.put(e3, "C");
		hashMap.put(e4, "D");

		System.out.println(hashMap.get(e2));
	}

}