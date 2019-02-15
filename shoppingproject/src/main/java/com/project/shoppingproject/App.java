package com.project.shoppingproject;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.shoppingproject.dao.ProductDAO;
import com.project.shoppingproject.pojo.Product;
import com.project.shoppingproject.service.ProductService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ProductService product = (ProductService) context.getBean(ProductService.class);
		product.getAllProducts();
		product.getProductDetails(413);

		/*product.remove(411);
		product.remove(412);
		product.remove(413);
		product.remove(414);
		
		product.add(new Product(411, "mobile", 20000, "excellent"));
		product.add(new Product(412, "Phone", 30000, "nice"));
		product.add(new Product(413, "dress", 2000, "beautiful"));
		product.add(new Product(414, "headset", 2000, "best sound quality"));
		product.remove(411);
		product.get(411);
		product.get(412);
		product.update(new Product(413,"dress", 5000, "beautiful"));
		List<Product> list = product.getAll();
		for (Product p1 : list)
			System.out.println(p1);*/
	}
}
