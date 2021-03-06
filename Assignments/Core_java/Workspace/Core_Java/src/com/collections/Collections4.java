package com.collections;

import java.util.*;

class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int hashCode() {
		return this.day+this.month;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.day==((Date)obj).getDay() && this.month==((Date)obj).getMonth())
			return true;
		return false;
	}
}

public class Collections4 {

	public static void main(String[] args) {
		Map<Date, String> hashMap = new HashMap<>();
		Date d1 = new Date(1, 1, 1);
		Date d2 = new Date(1, 1, 2);
		Date d3 = new Date(3, 3, 3);
		Date d4 = new Date(4, 4, 4);
		hashMap.put(d1, "A");
		hashMap.put(d2, "B");
		hashMap.put(d3, "C");
		hashMap.put(d4, "D");

		System.out.println(hashMap.get(d1));
	}

}