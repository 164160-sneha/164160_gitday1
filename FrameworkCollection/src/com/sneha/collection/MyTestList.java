package com.sneha.collection;

import java.util.ArrayList;
import java.util.List;

public class MyTestList {
	public static void main(String[] args) {
		MyList<Employee> list = new MyList<>();
		Employee emp1 = new Employee(10,"s");
		Employee emp2 = new Employee(20,"jk");
		list.listAdd(emp1);
		list.listAdd(emp2);
		
		

		
		System.out.println(list.listget());
		
		
		MyList<BankAccount> list1 = new MyList<BankAccount>();
		
		BankAccount b1 = new BankAccount(1,30000);
		BankAccount b2 = new BankAccount(2,70000);
		
		list1.listAdd(b1);
		list1.listAdd(b2);
		
		
		System.out.println(list1.listget());
	}

}
