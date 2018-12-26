package com.sneha.oop;

public class Labour extends Employee {
	public Labour(int salary){
		super(salary);
	}
	
	public void overtime(int overtime, int payrate){
		double labourTotalSalary=1.5*overtime*payrate;
		System.out.println(labourTotalSalary);
	}

}
