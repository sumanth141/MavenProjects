package com.sumanth.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sumanth.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("Its Awesome!!");
		product.setPrice(500);
		dao.create(product);
		dao.create(product);
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("Iphone", result.getName());
		
	}

}
