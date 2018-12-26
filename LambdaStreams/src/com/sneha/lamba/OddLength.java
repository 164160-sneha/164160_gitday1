package com.sneha.lamba;

import java.util.ArrayList;
import java.util.List;

public class OddLength {
	
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
		
		list.removeIf(n -> n.length()%2 !=0);
		
		System.out.println(list);
		}

}
