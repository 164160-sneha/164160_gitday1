package com.spring.mongodb.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.mongodb.dao.ProductDAO;
import com.spring.mongodb.model.Product;


public class SpringMongoDbXMLMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		ProductDAO productDAO = ctx.getBean("productDAO", ProductDAO.class);
		
		Product p = new Product(null,"Mobile","15000");
		
		//create
		productDAO.create(p);
		System.out.println("Generated ID="+p.getId());
		
		//read
		Product p1 = productDAO.readById(p.getId());
		System.out.println("Retrieved Product="+p1);
		
		/*//update
		p1.setName("David");p1.setAddress("SFO, USA");
		personDAO.update(p1);
		Person temp = personDAO.readById(p1.getId());
		System.out.println("Retrieved Person after update="+temp);
		
		//delete
		int count = personDAO.deleteById(p1.getId());
		System.out.println("Number of records deleted="+count);*/
		
		ctx.close();

	}

}
