package com.test.App.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.App.model.Product;

@Repository
public interface ProductRepositry extends CrudRepository<Product, Long> {

	public List<Product> findAll();
	
	public List<Product> findByBrand(String brand);
	
	public List<Product> findByPrice(int price);
	
	public List<Product> findByColor(String color);
	
	public List<Product> findBySize(int size);
	
	public List<Product> findBySku(int sku);
	
	public List<Product> findBySupplierId(int supplier_id);
}
