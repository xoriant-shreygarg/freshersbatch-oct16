package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Java8Features5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
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
		for(String s : list)
			System.out.println(s);
		Consumer<List<String>> consumer = (List<String> listOfStrings) -> {
			StringBuilder stringBuilder = new StringBuilder("");
			for(String str : listOfStrings)
				stringBuilder.append(str.charAt(0));
			System.out.println(stringBuilder);
		}; 
		System.out.println("\nString created from first letter of strings in list : ");
		consumer.accept(list);
	}
}