package com.test.App.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.App.dao.ProductRepositry;
import com.test.App.model.Product;
import com.test.App.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepositry productRepositry;

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepositry.findAll();
	}

	public List<Product> findByBrand(String brand) {
		// TODO Auto-generated method stub
		return productRepositry.findByBrand(brand);
	}

	public List<Product> groupByPrice(int price) {
		// TODO Auto-generated method stub
		return productRepositry.findByPrice(price);
	}

	public List<Product> groupByColor(String color) {
		// TODO Auto-generated method stub
		return productRepositry.findByColor(color);
	}

	public List<Product> groupBySize(int size) {
		// TODO Auto-generated method stub
		return productRepositry.findBySize(size);
	}

	public List<Product> groupBySku(int sku_id) {
		// TODO Auto-generated method stub
		return productRepositry.findBySku(sku_id);
	}

	public int noOfProductBySeller(int supplier_id) {
		// TODO Auto-generated method stub
		return productRepositry.findBySupplierId(supplier_id).size();
	}
	
	
	
	

}
