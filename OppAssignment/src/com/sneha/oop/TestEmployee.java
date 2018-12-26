package com.sneha.oop;

public class TestEmployee {
	public static void testManager() {
		Manager manager = new Manager(20000);
		System.out.println("salary " + manager.getSalary());
		manager.incentive(5000);

	}
	public static void testLabour() {
		Labour labour = new Labour(4000);
		System.out.println("salary "+labour.getSalary());
		labour.overtime(2,4000);
	}
	public static void main(String[] args) {
		testManager();
		testLabour();

	}

}
