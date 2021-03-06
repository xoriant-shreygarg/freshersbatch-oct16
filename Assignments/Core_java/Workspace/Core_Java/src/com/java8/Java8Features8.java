package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Java8Features8 {

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
		Consumer<List<String>> consumer = (list1) -> {
			new Thread(() -> {
				for (String s : list1)
					System.out.println(s);
			}).start();
		};
		consumer.accept(list);
	}
}