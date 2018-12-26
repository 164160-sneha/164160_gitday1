package com.sneha.lamba;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstLetter {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Sneha");
		list.add("Jungkook");
		list.add("Swathi");
		list.add("Jeevan");
		list.add("Shreya");
		list.add("Karan");
		list.add("Reshma");
		list.add("Kishant");
		
		List<Character> list1=list.stream().map(i -> i.charAt(0)).collect(Collectors.toList());
		list1.stream().forEach(i -> System.out.print(i));
	}
	

}
