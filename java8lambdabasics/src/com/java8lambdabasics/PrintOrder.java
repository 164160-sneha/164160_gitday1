package com.java8lambdabasics;

import java.util.Scanner;
import java.util.function.Predicate;

public class PrintOrder {
	int orderValue;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the order amount");
		int orderValue = sc.nextInt();

		Predicate<Integer> orderValue1 = (Value) -> Value >= 10000;

		if (orderValue1.test(orderValue)) {
			System.out.println("Order Accepted");
		} else
			System.out.println("Declined");
	}

}
