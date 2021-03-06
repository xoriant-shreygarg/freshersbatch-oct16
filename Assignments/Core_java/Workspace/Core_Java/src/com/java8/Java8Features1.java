package com.java8;

@FunctionalInterface
interface Operation{
	int operation(int x, int y);
}

public class Java8Features1 {

	public static void main(String[] args) {
		Operation add = (a,b) -> a+b;
		System.out.println(add.operation(1, 2));
		System.out.println(((Operation)(a,b) -> a+b).operation(1, 2));
		

		Operation subtact = (a,b) -> a-b;
		System.out.println(subtact.operation(1, 2));
		

		Operation multiply = (a,b) -> a*b;
		System.out.println(multiply.operation(1, 2));
		

		Operation divide = (a,b) -> a/b;
		System.out.println(divide.operation(1, 2));
	}
}
