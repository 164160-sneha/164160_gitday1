package com.sneha.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetexample {
	public static void main(String[] args) {
		Set<String> daysOfWeek = new LinkedHashSet<>();

		daysOfWeek.add("sunday");
		daysOfWeek.add("monday");
		daysOfWeek.add("tuesday");
		daysOfWeek.add("wednesday");
		daysOfWeek.add("thrusday");
		daysOfWeek.add("friday");
		daysOfWeek.add("saturday");
		

		System.out.println(daysOfWeek);
	}

}
