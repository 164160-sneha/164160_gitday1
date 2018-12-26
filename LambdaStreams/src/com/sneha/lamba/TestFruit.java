package com.sneha.lamba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TestFruit {

	public static void main(String[] args) {

		List<Fruit> fruit = new ArrayList<Fruit>();

		Fruit fruit1 = new Fruit("Apple", 100, 100, "Red");
		Fruit fruit2 = new Fruit("Orange", 130, 105, "Orange");
		Fruit fruit3 = new Fruit("Grape", 150, 155, "Green");
		Fruit fruit4 = new Fruit("Mango", 190, 115, "yellow");
		Fruit fruit5 = new Fruit("Chickoo", 217, 105, "Brown");
		Fruit fruit6 = new Fruit("Strawberry", 90, 125, "Red");
		Fruit fruit7 = new Fruit("Tomato", 80, 115, "Red");
		Fruit fruit8 = new Fruit("Banana", 150, 165, "yellow");

		fruit.add(fruit1);
		fruit.add(fruit2);
		fruit.add(fruit3);
		fruit.add(fruit4);
		fruit.add(fruit5);
		fruit.add(fruit6);
		fruit.add(fruit7);
		fruit.add(fruit8);

		Stream<Fruit> stream1 = fruit.stream();
		Stream<Fruit> stream2 = fruit.stream();
		Stream<Fruit> stream3 = fruit.stream();
		stream1.filter(c -> c.getCalories() > 100)
				.sorted(Comparator.comparing(Fruit::getCalories).reversed())
				.forEach(System.out::println);
		System.out
				.println("----------------------------------------------------------");
		stream2.sorted((n1, n2) -> (n1.getColor()).compareTo(n2.getColor()))
				.forEach(System.out::println);
		System.out
				.println("----------------------------------------------------------");
		stream3.filter(c -> c.getColor() == "Red")
				.sorted(Comparator.comparing(Fruit::getPrice))
				.forEach(System.out::println);

	}
}
