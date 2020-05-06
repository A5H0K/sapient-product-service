package com.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.test.App.model.Product;
import com.test.App.service.ProductService;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ProductApiTest {
	
	@MockBean
	ProductService productService;
	
	@Test
	public void testMethod(){
		List<Product> productList = new ArrayList();
		when(productService.findByBrand("A")).thenReturn(productList);
	}

}
