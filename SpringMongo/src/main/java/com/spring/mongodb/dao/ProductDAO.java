package com.spring.mongodb.dao;

import com.spring.mongodb.model.Product;

public interface ProductDAO {
	
public void create(Product p);
	
	public Product readById(String id);
	
	public void update(Product p);
	
	public int deleteById(String id);

}
