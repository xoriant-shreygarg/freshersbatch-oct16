package com.streams;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class StreamsMain {

	public static void main(String[] args) {
		// streams1();
		// streams2();
		// streams3();
		streams4(); // left
		// streams5(); //left
		// streams6(); //left
		// streams7();
		// streams8();
		// streams9();
		// streams10();
		// stream11();
		// stream12();
		// stream13();
		// stream14();
		// stream15();
	}

	private static void stream15() {
	}

	private static void stream14() {
		Optional<Transaction> minValue = TestData.getAllTransactions().stream()
				.sorted(Comparator.comparing((Function<Transaction, Integer>) (t) -> t.getValue())).findFirst();
		if (minValue.isPresent())
			System.out.println(minValue.get());
	}

	private static void stream13() {
		Optional<Integer> maxValue = TestData.getAllTransactions().stream().map(Transaction::getValue)
				.reduce(Integer::max);
		if (maxValue.isPresent())
			System.out.println("Max Value = " + maxValue.get());
	}

	private static void stream12() {
		TestData.getAllTransactions().stream().filter((t) -> t.getTrader().getCity().equalsIgnoreCase("Delhi"))
				.forEach(System.out::println);
	}

	private static void stream11() {
		boolean indore = TestData.getAllTransactions().stream()
				.anyMatch((t) -> t.getTrader().getCity().equalsIgnoreCase("Indore"));
		System.out.println("Are any traders based in Indore? " + indore);
	}

	private static void streams10() {
		TestData.getAllTransactions().stream().map(Transaction::getTrader).sorted(Comparator.comparing(Trader::getName))
				.map(Trader::getName).forEach(System.out::println);
	}

	private static void streams9() {
		TestData.getAllTransactions().stream().map(Transaction::getTrader)
				.filter((t) -> t.getCity().equalsIgnoreCase("Pune")).sorted(Comparator.comparing(Trader::getName))
				.forEach(System.out::println);
	}

	private static void streams8() {
		TestData.getAllTransactions().stream().map((t) -> t.getTrader().getCity()).distinct()
				.forEach(System.out::println);
	}

	private static void streams7() {
		List<Transaction> list = TestData.getAllTransactions().stream().filter((t) -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
		TestData.printTransactions(list);
	}

	private static void streams6() {
		
	}

	private static void streams5() {
		long numberOfTimes = TestData.getAllNews().stream().filter(t -> t.getComment().contains("budget")).count();
		System.out.println(numberOfTimes);
	}

	private static void streams4() {
		Optional<Integer> newsId = TestData.getAllNews().stream().collect(groupingBy(News::getNewsId, counting()))
				.entrySet().stream().sorted(Comparator.comparing((Entry<Integer, Long> e) -> e.getValue()).reversed())
				.findFirst().map((Entry<Integer, Long> e) -> e.getKey());
		if(newsId.isPresent())
			System.out.println("News Id with maximum comments = "+newsId.get());
	}

	private static void streams3() {
		List<Fruit> filteredFruits = TestData.getAllFruits().stream()
				.filter((Fruit f) -> f.getColor().equalsIgnoreCase("red")).sorted(Comparator.comparing(Fruit::getPrice))
				.collect(Collectors.toList());
		TestData.printFruits(filteredFruits);
	}

	private static void streams2() {
		TestData.getAllFruits().stream().collect(groupingBy(Fruit::getColor)).entrySet().stream()
				.forEach(System.out::println);
	}

	private static void streams1() {
		List<Fruit> filteredFruits = TestData.getAllFruits().stream().filter((Fruit f) -> f.getCalories() > 100)
				.sorted(Comparator.comparing(Fruit::getCalories).reversed()).collect(Collectors.toList());
		TestData.printFruits(filteredFruits);
	}

}
