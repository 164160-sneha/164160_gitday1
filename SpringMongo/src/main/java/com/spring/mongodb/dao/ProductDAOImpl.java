package com.spring.mongodb.dao;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import com.mongodb.WriteResult;
import com.spring.mongodb.model.Product;

public class ProductDAOImpl implements ProductDAO {
	
	private MongoOperations mongoOps;
	private static final String PRODUCT_COLLECTION = "Product";
	
	public ProductDAOImpl(MongoOperations mongoOps){
		this.mongoOps=mongoOps;
	}

	@Override
	public void create(Product p) {
		this.mongoOps.insert(p, PRODUCT_COLLECTION);
		
	}

	@Override
	public Product readById(String id) {
		Query query = new Query(Criteria.where("_id").is(id));
		return this.mongoOps.findOne(query, Product.class, PRODUCT_COLLECTION);
	}

	@Override
	public void update(Product p) {
		this.mongoOps.save(p, PRODUCT_COLLECTION);
		
	}

	@Override
	public int deleteById(String id) {
		Query query = new Query(Criteria.where("_id").is(id));
		WriteResult result =  this.mongoOps.remove(query, Product.class, PRODUCT_COLLECTION);
		return result.getN();
	}

}
