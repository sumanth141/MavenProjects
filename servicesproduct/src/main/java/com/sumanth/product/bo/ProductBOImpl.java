package com.sumanth.product.bo;

import com.sumanth.product.dao.ProductDAO;
import com.sumanth.product.dao.ProductDAOImpl;
import com.sumanth.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
