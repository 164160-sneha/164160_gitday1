package com.sneha.lamba;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestTrader {

	public static void main(String[] args) {
		List<Trader> list = new ArrayList<Trader>();
		
		Trader trader1 = new Trader("Sneha","Karwar");
		Trader trader2 = new Trader("Jeevan","Pune");
		Trader trader3 = new Trader("Rohan","Bangalore");
		Trader trader4 = new Trader("Shree","Kolkatta");
		Trader trader5 = new Trader("Swati","Indore");
		Trader trader6 = new Trader("Tayyab","Delhi");
		Trader trader7 = new Trader("Shreya","Pune");
		
		list.add(trader1);
		list.add(trader2);
		list.add(trader3);
		list.add(trader4);
		list.add(trader5);
		list.add(trader6);
		list.add(trader7);
		
		Stream<Trader> stream1 = list.stream();
		Stream<Trader> stream2 = list.stream();
		Stream<Trader> stream3 = list.stream();
		Stream<Trader> stream4 = list.stream();
		
		stream1.distinct().forEach(System.out::println);;
		System.out
		.println("----------------------------------------------------------");
		stream2.filter(c-> c.getCity()=="Pune").sorted((n1, n2) -> n1.getName().compareTo(n2.getName())).forEach(System.out::println);
		System.out
		.println("----------------------------------------------------------");
		stream3.sorted((n1, n2) -> n1.getName().compareTo(n2.getName())).forEach(System.out::println);
		System.out
		.println("----------------------------------------------------------");
		boolean answer= stream4.anyMatch(c -> c.getCity() == "Indore");
		System.out.println(answer);
		
		
	}
}
