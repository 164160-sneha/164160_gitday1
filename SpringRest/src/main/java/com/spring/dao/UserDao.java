package com.spring.dao;


import java.util.HashMap;

import java.util.Map;

import org.sneha.pojo.SpringRest.Zipcode;

public class UserDao{

	public  Map<Long, Zipcode> getAllMessages(){
		Map<Long, Zipcode> map = new HashMap<Long, Zipcode>();

		map.put(99501L, new Zipcode("Ak", "ANCHORAGE", "US"));
		map.put(5813012L, new Zipcode("Karwar", "Karnataka", "India"));
		return map;

	}

}
