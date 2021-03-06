package com.generics;

import java.util.HashMap;
import java.util.Iterator;

public class Generics3 {
	
	private static void printMapKeyValues(HashMap<? extends Number, ?> hmap) {
		Iterator<? extends Number> iterator = hmap.keySet().iterator();
		while(iterator.hasNext()){
			Number key = iterator.next();
			System.out.println(key + "- " + hmap.get(key));}
	}
	
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "A");
		hmap.put(2, "B");
		hmap.put(3, "C");
		hmap.put(4, "D");
		printMapKeyValues(hmap);
		HashMap<String, String> hmap2 = new HashMap<>();
		hmap2.put("1", "A");
		hmap2.put("2", "B");
		hmap2.put("3", "C");
		hmap2.put("4", "D");
//		printMapKeyValues(hmap2); //error
	}

}
