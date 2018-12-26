package com.sneha.util;

import com.sneha.dao.IUserDAO;
import com.sneha.dao.UserDAO;
import com.sneha.dao.UserDAOVer2;

public class DAOUtility {
	
	public static IUserDAO getUserDAO(){
		return new UserDAOVer2();
	}

}
