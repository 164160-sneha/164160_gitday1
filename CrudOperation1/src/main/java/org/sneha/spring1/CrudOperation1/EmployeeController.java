package org.sneha.spring1.CrudOperation1;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sneha.spring1.pojo.Employee;


@Path("/user")
public class EmployeeController {
	
	EmployeeDetails employeeService =new EmployeeDetails();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Employee> getemp(){
		return employeeService.addUser();

}
}