package com.sneha.oop;

public class Manager extends Employee {
	public Manager(int salary){
		super(salary);
	}
	

	public void incentive(int incentive) {
		int managerTotalSalary=getSalary() +incentive;
		System.out.println(+managerTotalSalary);
	}
}
