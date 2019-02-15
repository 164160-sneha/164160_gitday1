package com.project.shoppingproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.project.shoppingproject.pojo.Product;

public class ProductDAO implements IProductDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int get(long productId) {
		String query = "select * from Product where productId = '"+productId+"'";
		return jdbcTemplate.update(query);
		
	}

	public int add(Product product1) {
		String query = "insert into Product values('" + product1.getProductId() + "','" + product1.getProductName()
				+ "','" + product1.getProductPrice() + "','" + product1.getProductDescription() + "')";
		return jdbcTemplate.update(query);

	}

	public int remove(long productId) {
		String query = "delete from Product where productId= '" + productId + "' ";
		return jdbcTemplate.update(query);
	}

	public int update(Product product1) {
		String query = "update Product set productPrice='" + product1.getProductPrice() + "' where productId='"
				+ product1.getProductId() + "' ";
		return jdbcTemplate.update(query);

	}

	public List<Product> getAll() {
		return jdbcTemplate.query("select * from product", new ResultSetExtractor<List<Product>>() {
			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Product> list = new ArrayList<Product>();
				while (rs.next()) {
					Product product1 = new Product();

					product1.setProductId(rs.getInt("productId"));
					product1.setProductName(rs.getString("productName"));
					product1.setProductPrice(rs.getInt("productPrice"));
					product1.setProductDescription(rs.getString("productDescription"));

					list.add(product1);
				}
				return list;
			}
		});
	}
}
