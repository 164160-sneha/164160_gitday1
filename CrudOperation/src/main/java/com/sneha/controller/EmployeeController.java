package com.sneha.controller;

import java.util.ArrayList;

import org.sneha.dao.Employee;
import org.sneha.springrestful.CrudOperation.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDetails emp =new EmployeeDetails();
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public ArrayList<Employee> addUser(){
		return emp.getInfo();

}
}
