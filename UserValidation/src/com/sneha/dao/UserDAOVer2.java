package com.sneha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sneha.pojo.User;

public class UserDAOVer2 implements IUserDAO {

	@Override
	public String getUserType(String userName, String password) {
		Connection connection = ConnectionFactory.getConnention();
		try {

			PreparedStatement statement = connection
					.prepareStatement("select * from UserTable where userName=? and password=?");
			statement.setString(1, userName);
			statement.setString(2, password);
			ResultSet set = statement.executeQuery();
			while (set.next()) {
				if (set.getString("userName").equals(userName)
						&& set.getString("password").equals(password)) {
					return set.getString("userType");
				}
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;
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

	public static void main(String[] args) {
		System.out.println(new UserDAOVer2().getUserType("sneha", "java"));
	}
}
