package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Java8Features6 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("shrey");
		list.add("archit");
		list.add("tom");
		list.add("sarita");
		list.add("jerry");
		list.add("sneha");
		list.add("archana");
		list.add("mayur");
		list.add("yash");
		list.add("anand");
		for(String s : list)
			System.out.println(s);
		UnaryOperator<String> operator = (String s) -> String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
		System.out.println("\nAfter UnaryOperator : \n");
		list.replaceAll(operator);
		for(String s : list)
			System.out.println(s);
	}
}