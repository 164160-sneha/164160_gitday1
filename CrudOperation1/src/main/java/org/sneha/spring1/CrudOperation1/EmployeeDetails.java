package org.sneha.spring1.CrudOperation1;

import java.util.ArrayList;
import java.util.Iterator;

import org.sneha.spring1.pojo.Employee;



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
	list.remove(m4);
	
	System.out.println(list);
	return list;

}
	
	public Employee findByName(String employeeName) {
        for(Employee emp : list){
            if(emp.getEmployeeName().equalsIgnoreCase(employeeName)){
                return emp;
            }
        }
        return null;
    }
 
	 public ArrayList<Employee> deleteUserById(String employeeName) {
         
	        for (Iterator<Employee> iterator = list.iterator(); iterator.hasNext(); ) {
	            Employee emp = iterator.next();
	            if (emp.getEmployeeName() == employeeName) {
	                iterator.remove();
	            }
	        }
			return list;
	    }
	public ArrayList<Employee> deleteAllUsers() {
        list.clear();
        return list;
    }
	
	public ArrayList<Employee> addUser() {
		 for(Employee emp : list){
		  list.add(emp);
		 }
		 return list;
	}
	
	public ArrayList<Employee> search() {
		return new ArrayList<Employee>(list);
		
	}
	
}
