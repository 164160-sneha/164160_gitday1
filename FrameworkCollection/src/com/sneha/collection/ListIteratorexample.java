package com.sneha.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorexample {

	public static void main(String[] args) {

		List<String> place = new ArrayList<String>();
		

		place.add("karwar");
		place.add("bangalore");
		place.add("ankola");
		place.add("margoa");
		
		ListIterator<String> listIterator = place.listIterator();
		System.out.println("----List in Forward direction----");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("----List in Reverse direction----");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
