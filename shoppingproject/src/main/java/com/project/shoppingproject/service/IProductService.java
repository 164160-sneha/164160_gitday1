package com.project.shoppingproject.service;

import java.util.List;

import com.project.shoppingproject.pojo.Product;

public interface IProductService {
	
	public int getAllProducts();
	public int getProductDetails(long productId);

}
