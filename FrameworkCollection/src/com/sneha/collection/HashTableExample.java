package com.sneha.collection;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;

public class HashTableExample {
	public static void main(String[] args) {
		Map<Employee, String> map = new HashMap<Employee, String>(); 
		Employee emp = new Employee(100, "sneha");
		Employee emp1 = new Employee(100, "sneha");
		Employee emp2 = new Employee(101, "swathi");
		Employee emp3 = new Employee(102, "shreya");
		Employee emp4 = new Employee(103, "shiv");
		
		
        map.put(emp, "CSE"); 
        map.put(emp1, "IT"); 
        map.put(emp2, "EEE");
        System.out.println(emp.equals(emp1));
        System.out.println(emp3.equals(emp4));
        
        System.out.println(emp.hashCode());
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp3.hashCode());
        System.out.println(emp4.hashCode());
        
        System.out.println(emp);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        
        for(Employee employee : map.keySet()) 
        { 
  
            System.out.println(map.get(employee).toString());
            System.out.println();
            
        } 
	}

}
