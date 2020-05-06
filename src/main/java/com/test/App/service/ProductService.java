package com.test.App.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.App.model.Product;

@Service
public interface ProductService {
	
	
	List<Product> groupByPrice(int price);
	
	List<Product> groupByColor(String color);
	
	List<Product> groupBySize(int size);
	
	List<Product> groupBySku(int sku_id);
	
	List<Product> getAllProducts();
	
	List<Product> findByBrand(String brand);
	
	int noOfProductBySeller(int supplier_id);

}
