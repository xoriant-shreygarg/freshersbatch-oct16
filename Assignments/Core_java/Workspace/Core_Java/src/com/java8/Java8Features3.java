package com.java8;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8Features3 {

	public static void main(String[] args) {
		System.out.println("\nPredicate :");
		Predicate<String> predicate = (String s) -> s.length()>10;
		System.out.println("String length greater than 10 : "+ predicate.test("Hello world"));

		System.out.println("\nConsumer :");
		Consumer<String[]> consumer = (String[] s) -> System.out.println(Arrays.toString(s));
		consumer.accept(new String[]{"Hello"," welcome"," to"," java"," 8"});

		System.out.println("\nSupplier :");
		Supplier<Double> supplier = () -> Math.random();
		System.out.println("Random double number :  "+ supplier.get());

		System.out.println("\nFunction :");
		Function<String, Integer> function = (String s) -> s.length();
		System.out.println("Length of string :  "+ function.apply("Hello World"));
	}
}
