package com.luizfd.dscatalog.tests;

import java.time.Instant;

import com.luizfd.dscatalog.dto.ProductDTO;
import com.luizfd.dscatalog.entities.Category;
import com.luizfd.dscatalog.entities.Product;

public class Factory {
	
	public static Product createProduct() {
		Product product = new Product(1L, "GFDGDF", "sfdgdfgd", 10.0, "dgfsfg", Instant.parse("2023-05-02T14:00:00Z"));
		product.getCategories().add(createCategory());
		return product;
	}
	
	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}
	
	public static Category createCategory() {
		return new Category(1L,"Electronics");
	}

}
