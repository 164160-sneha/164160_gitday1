package org.sneha.springrestful.CrudOperation;

import java.util.ArrayList;

import org.sneha.dao.Employee;

public class EmployeeDetails {
	
	ArrayList<Employee> list= new ArrayList<>();
	
	public ArrayList<Employee> getInfo() {
	Employee m1=new Employee(1,"sneha",10,"software eng",20000);
	Employee m2=new Employee(2,"jeevan",20,"test eng",15000);
	Employee m3=new Employee(3,"rohan",30,"software eng",25000);
	Employee m4=new Employee(4,"Mahesh",40,"test eng",10000);
	list.add(m1);
	list.add(m2);
	list.add(m3);
	list.add(m4);
	return list;
		
}
}