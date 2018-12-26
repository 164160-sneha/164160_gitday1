package com.sneha.lamba;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UpperCase {
	
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
		
		//UnaryOperator<String> unaryOpt = i->i.toUpperCase();
		
		list.replaceAll(n -> n.toUpperCase());
		System.out.println(list);
		
		}

}
