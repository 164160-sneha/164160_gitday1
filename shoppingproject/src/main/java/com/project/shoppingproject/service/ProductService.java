package com.project.shoppingproject.service;

import java.util.ArrayList;
import java.util.List;

import com.project.shoppingproject.dao.ProductDAO;
import com.project.shoppingproject.pojo.Product;


public class ProductService implements IProductService {
	ProductDAO productdao;
	
	
	public ProductDAO getProductdao() {
		return productdao;
	}

	public void setProductdao(ProductDAO productdao) {
		this.productdao = productdao;
	}

	public int getAllProducts() {
		List<Product> p1 =productdao.getAll();
		for(Product p: p1) {
			System.out.println(p);
		}
		return 0;
		
	}

	public int getProductDetails(long productId) {
		return productdao.get(412);
		 
		
}
		
}
