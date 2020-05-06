package com.test.App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.App.model.Product;
import com.test.App.service.ProductService;

@RestController
@RequestMapping("/productApi")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		
		return productService.getAllProducts();
	}
	
	@GetMapping("/groupByBrand")
	public List<Product> groupByBrand(@RequestParam String brand){
		
		return productService.findByBrand(brand);
	}
	
	@GetMapping("/groupByPrice")
	public List<Product> groupByPrice(@RequestParam int price){
		
		return productService.groupByPrice(price);
	}
	
	@GetMapping("/groupByColor")
	public List<Product> groupByColor(@RequestParam String color){
		
		return productService.groupByColor(color);
	}
	
	@GetMapping("/groupBySize")
	public List<Product> groupBySize(@RequestParam int size){
		
		return productService.groupBySize(size);
	}
	
	@GetMapping("/groupBySku")
	public List<Product> groupBySku(@RequestParam int sku){
		
		return productService.groupBySku(sku);
	}
	
	
	@GetMapping("/numberofProductBySeller")
	public int noOfProductBySeller(@RequestParam int supplier_id){
		
		return productService.noOfProductBySeller(supplier_id);
	}

}
