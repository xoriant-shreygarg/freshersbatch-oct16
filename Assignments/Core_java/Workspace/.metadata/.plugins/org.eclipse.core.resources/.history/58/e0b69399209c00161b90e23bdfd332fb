package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Java8Features4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Predicate<String> filter = (String s) -> s.length()%2!=0;
		list.add("Shrey");
		list.add("Archit");
		list.add("Tom");
		list.add("Sarita");
		list.add("Jerry");
		list.add("Sneha");
		list.add("Archana");
		list.add("Mayur");
		list.add("Yash");
		list.add("Anand");
		print(list);
		System.out.println("\nAfter filtering strings with odd lengths :\n ");
		list.removeIf(filter);
		print(list);
	}
	
	private static void print(List<String> list) {
		for(String s : list)
			System.out.println(s);
	}
}
