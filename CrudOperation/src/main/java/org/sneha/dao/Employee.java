package org.sneha.dao;

public class Employee {
	public int employeeId;
	public String employeeName;
	public int employeeDepartment;
	public String employeeDesignation;
	public int employeeSalary;
	
	
	public Employee(int employeeId, String employeeName, int employeeDepartment, String employeeDesignation,
			int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public int getEmployeeDepartment() {
		return employeeDepartment;
	}


	public void setEmployeeDepartment(int employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}


	public String getEmployeeDesignation() {
		return employeeDesignation;
	}


	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}


	public int getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDepartment="
				+ employeeDepartment + ", employeeDesignation=" + employeeDesignation + ", employeeSalary="
				+ employeeSalary + "]";
	}

	
}
