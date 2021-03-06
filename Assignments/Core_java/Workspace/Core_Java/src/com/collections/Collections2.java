package com.collections;

import java.util.*;

class Person2 {
	private String name;
	private Integer weight;
	private Integer height;

	public Person2(String name, Integer weight, Integer height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}
}

public class Collections2 {

	public static void main(String[] args) {
		Set<Person2> hashSet = new LinkedHashSet<Person2>();
		hashSet.add(new Person2("Shrey", 60, 143));
		hashSet.add(new Person2("Archit", 50, 154));
		hashSet.add(new Person2("Archana", 60, 154));
		hashSet.add(new Person2("Sneha", 60, 150));
		hashSet.add(new Person2("Avin", 70, 123));
		Iterator<Person2> itr = hashSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
/*

HashSet
-------
Person2 [name=Archana, weight=60, height=154]
Person2 [name=Avin, weight=70, height=123]
Person2 [name=Shrey, weight=60, height=143]
Person2 [name=Archit, weight=50, height=154]
Person2 [name=Sneha, weight=60, height=150]


LinkedHashSet
-------------
Person2 [name=Shrey, weight=60, height=143]
Person2 [name=Archit, weight=50, height=154]
Person2 [name=Archana, weight=60, height=154]
Person2 [name=Sneha, weight=60, height=150]
Person2 [name=Avin, weight=70, height=123]

*/