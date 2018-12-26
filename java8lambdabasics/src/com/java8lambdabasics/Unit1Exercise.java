package com.java8lambdabasics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {
	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("sneha", "mahale", 22),
				new Person("jeevan", "mahale", 28),
				new Person("Chethan","mallya", 26), 
				new Person("Jayesh", "Caroll", 22));
		// Collections.sort(people , p -> ;

		Collections.sort(people, ( p1,  p2) -> p1.getLastName().compareTo(p2.getFirstName()));

		printConditionally(people,p->true);
		System.out.println("lastname with c-------------");
		printConditionally(people, p->p.getLastName().startsWith("C"));

			
		System.out.println("firstname with c-------------");
		printConditionally(people, p -> p.getFirstName().startsWith("C"));
		

	}

	private static void printConditionally(List<Person> people,Condition condition) {
		for(Person p : people)
			if(condition.test(p)){
				
				System.out.println(p);
			}
		
	}

	
	interface Condition{
		boolean test(Person p);
	}

}
