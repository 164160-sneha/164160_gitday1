package com.spring.mongodb.main;

import java.net.UnknownHostException;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import com.mongodb.MongoClient;
import com.spring.mongodb.model.Product;

public class SpringDataMongoDbMain {
	
	public static final String DB_NAME = "sneha";
	public static final String PRODUCT_COLLECTION = "Product";
	public static final String MONGO_HOST = "localhost";
	public static final int MONGO_PORT = 27017;

	public static void main(String[] args) {
		try {
			MongoClient mongo = new MongoClient(
					MONGO_HOST, MONGO_PORT);
			MongoOperations mongoOps = new MongoTemplate(mongo, DB_NAME);
			Product p = new Product("113", "Mobile", "15000");
			mongoOps.insert(p, PRODUCT_COLLECTION);

			Product p1 = mongoOps.findOne(
					new Query(Criteria.where("name").is("Mobile")),
					Product.class, PRODUCT_COLLECTION);

			System.err.println(p1);
			
			//mongoOps.dropCollection(PERSON_COLLECTION);
			//mongo.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
