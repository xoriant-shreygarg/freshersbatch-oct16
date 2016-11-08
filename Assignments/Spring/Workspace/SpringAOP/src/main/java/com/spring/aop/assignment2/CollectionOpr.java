package com.spring.aop.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CollectionOpr {

	public void addInVector() {
		List<Integer> integers = new Vector<Integer>();
		for (int i = 0; i < 10000; i++) {
			integers.add(i);
		}
	}

	public void addInList() {
		List<Integer> integers = new ArrayList<Integer>();
		for (int i = 0; i < 10000; i++) {
			integers.add(i);
		}
	}

}
