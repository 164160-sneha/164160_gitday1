package com.spring;

import java.util.ArrayList;



public class UserDAO {
	ArrayList<Login> loginList;

	public UserDAO() {
		loginList = new ArrayList<>();
		loginList.add(new Login("sneha", "java"));
		loginList.add(new Login("sachin", "sql"));
		loginList.add(new Login("rahul", "java"));

	}

	public void Check(String UserName, String password) {
		for (Login login : loginList) {
			if (login.getUserName().equals(UserName)
					&& login.getPassword().equals(password)) {
			}
			
		}
		
	}

	
	
	

}
