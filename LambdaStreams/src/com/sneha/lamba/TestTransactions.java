package com.sneha.lamba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class TestTransactions {
	
	public static void main(String[] args) {
		
		List<Transactions> list = new ArrayList<Transactions>();
		
		Transactions t1 = new Transactions( new Trader("Sneha","Karwar") , 2000, 8);
		Transactions t2 = new Transactions(new Trader("Jeevan","Pune"), 2011, 6);
		Transactions t3 = new Transactions(new Trader("Rohan","Bangalore") , 2011, 2);
		Transactions t4 = new Transactions(new Trader("Shree","Kolkatta") , 2017, 4);
		Transactions t5 = new Transactions(new Trader("Swati","Indore") , 2019, 7);
		Transactions t6 = new Transactions( new Trader("Tayyab","Delhi"), 2014, 5);
		Transactions t7 = new Transactions( new Trader("Shreya","Delhi"), 2017, 7);
		
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		
		Stream<Transactions> stream1 = list.stream();
		Stream<Transactions> stream2 = list.stream();
		Stream<Transactions> stream3 = list.stream();
		Stream<Transactions> stream4 = list.stream();
		
		stream1.filter(c->c.getYear() == 2011).sorted(Comparator.comparing(Transactions :: getValue)).forEach(System.out::println);
		System.out
		.println("----------------------------------------------------------");
		stream2.filter(c->c.getTrader().city == "Delhi").sorted(Comparator.comparing(Transactions :: getValue)).forEach(System.out::println);
		System.out
		.println("----------------------------------------------------------");
		OptionalInt max = list.stream().mapToInt(Transactions::getValue).max();
		System.out.println(max);
		System.out
		.println("----------------------------------------------------------");
		OptionalInt min = list.stream().mapToInt(Transactions::getValue).min();
		System.out.println(min);
	}

}
