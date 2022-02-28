package com.sumanth.product.bo;

import com.sumanth.product.dto.Product;

public interface ProductBO {
	
	void create(Product product);
	
	Product findProduct(int id);
	

}
