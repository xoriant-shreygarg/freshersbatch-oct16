package com.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics2 {
	
	public static void print(List<? extends Number> list) {
		for(Object obj : list)
			System.out.println(obj);
	}
	
	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		print(integerList);
//		List<String> stringList = new ArrayList<>();
//		integerList.add("A");//error
//		integerList.add("B");//error
//		integerList.add("C");//error
//		print(stringList);
	}

}
