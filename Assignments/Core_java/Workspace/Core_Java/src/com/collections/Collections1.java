package com.collections;

import java.util.*;

class Person {
	private String name;
	private Integer weight;
	private Integer height;

	public Person(String name, Integer weight, Integer height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", height=" + height + "]";
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

public class Collections1 {

	public static void main(String[] args) {
		Set<Person> treeSet = new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getWeight() > o2.getWeight())
					return 1;
				if (o1.getWeight() < o2.getWeight())
					return -1;
				else {
					if (o1.getHeight() > o2.getHeight())
						return 1;
					if (o1.getHeight() < o2.getHeight())
						return -1;
					return 0;
				}
			}
		});
		treeSet.add(new Person("Shrey", 60, 143));
		treeSet.add(new Person("Archit", 50, 154));
		treeSet.add(new Person("Archana", 60, 154));
		treeSet.add(new Person("Sneha", 60, 150));
		treeSet.add(new Person("Avin", 70, 123));
		Iterator<Person> itr = treeSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

/*
 * package com.collections;
 * 
 * import java.util.*;
 * 
 * class Person implements Comparable<Person> { private String name; private
 * Integer weight; private Integer height;
 * 
 * public Person(String name, Integer weight, Integer height) { super();
 * this.name = name; this.weight = weight; this.height = height; }
 * 
 * @Override public String toString() { return "Person [name=" + name +
 * ", weight=" + weight + ", height=" + height + "]"; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public Integer getWeight() { return weight; }
 * 
 * public void setWeight(Integer weight) { this.weight = weight; }
 * 
 * public Integer getHeight() { return height; }
 * 
 * public void setHeight(Integer height) { this.height = height; }
 * 
 * @Override public int compareTo(Person o) { if (this.getWeight() >
 * o.getWeight()) { return 1; } else if (this.getWeight() < o.getWeight()) {
 * return -1; } else { if (this.getHeight() > o.getHeight()) { return 1; } else
 * if (this.getHeight() < o.getHeight()) { return -1; } return 0; } } }
 * 
 * public class Collections1 {
 * 
 * public static void main(String[] args) { Set<Person> treeSet = new
 * TreeSet<Person>(); treeSet.add(new Person("Shrey", 60, 143)); treeSet.add(new
 * Person("Archit", 50, 154)); treeSet.add(new Person("Archana", 60, 154));
 * treeSet.add(new Person("Sneha", 60, 150)); treeSet.add(new Person("Avin", 70,
 * 123)); Iterator<Person> itr = treeSet.iterator(); while (itr.hasNext()) {
 * System.out.println(itr.next()); } }
 * 
 * }
 */
