package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;

public class Java8Features7 {

	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "Shrey");
		hmap.put(2, "Archit");
		hmap.put(3, "Tom");
		hmap.put(4, "Sarita");
		hmap.put(5, "Archana");
		hmap.put(6, "Jerry");
		hmap.put(7, "Akshay");
		hmap.put(8, "Aditya");
		Function<Map<Integer, String>, StringBuilder> function = (hmap1) -> {
			Set<Entry<Integer, String>> entry = hmap1.entrySet();
			StringBuilder builder = new StringBuilder("");
			for (Entry<Integer, String> e : entry)
				builder.append(e.getKey() + " - " + e.getValue());
			return builder;
		};
		System.out.println(function.apply(hmap));

	}
}