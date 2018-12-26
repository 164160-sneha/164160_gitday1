package com.sneha.dao;

import java.util.ArrayList;

import com.sneha.pojo.User;

public class UserDAO implements IUserDAO{

	ArrayList<User> userList;

	public UserDAO() {
		userList = new ArrayList<>();
		userList.add(new User("sneha", "java", "Admin"));
		userList.add(new User("sachin", "sql", "User"));
		userList.add(new User("rahul", "java", "Admin"));

	}

	public String getUserType(String userName, String password) {
		for (User user : userList) {
			if (user.getUserName().equals(userName)
					&& user.getPassword().equals(password)) {
				return user.getUserType();
			}
		}
		throw new InvalidUserException(
				"User Name and Password doesnt exists...");
	}

	@Override
	public void addUser(User user) {
		
		
	}

	@Override
	public void changePassword(String userName, String oldPassword,
			String newPassword) {
		
		
	}

	@Override
	public void removeUser(String userName) {
		
		
	}

}
