package com.collections;

import java.util.*;


public class Collections3 {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("F");
		ListIterator<String> iterator = arrayList.listIterator();
		while(iterator.hasNext())
			iterator.next();
		while(iterator.hasPrevious())
			System.out.println(iterator.previous());
	}

}