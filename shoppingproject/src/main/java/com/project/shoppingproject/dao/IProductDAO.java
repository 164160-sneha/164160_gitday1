package com.project.shoppingproject.dao;

import java.util.List;

import com.project.shoppingproject.pojo.Product;

public interface IProductDAO {
	public int get(long productId);
	public int add(Product product1);
	public int remove(long productId);
	public int update(Product product1);
	public List<Product> getAll();
}
