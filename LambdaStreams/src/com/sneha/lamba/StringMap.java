package com.sneha.lamba;

import java.util.HashMap;

import java.util.Map;

public class StringMap {
	public static void main(String[] args) {

		Map<String, Integer> list = new HashMap<String, Integer>();

		list.put("Sneha", 1);
		list.put("Jungkook", 2);
		list.put("Swathi", 3);
		list.put("Jeevan", 4);
		list.put("Shreya", 5);
		list.put("Karan", 6);
		list.put("Reshma", 7);
		list.put("Kishant", 8);

		System.out.println("The set is: " + list.entrySet());

	}
}
