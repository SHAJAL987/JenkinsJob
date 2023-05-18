package com.data.jpa.testcase;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.data.jpa.data.ProductList;
import com.data.jpa.model.Product;
import com.data.jpa.repository.ProductRepository;

@SpringBootTest
public class QueryTestCase {
	@Autowired
	private ProductRepository productRepository;
	
	/*@Test
	void finAllProduct() {
		List<Product> product = productRepository.findAll();
		product.forEach((p)->{
			System.out.println("Id:"+p.getId()+" Name:"+p.getName());

		});
	}
	
	@Test
	void productFindByField() {
		try {
			Long id = 6L;
			String sku = "p01";
			Product product = productRepository.getProductById(id,sku);
			System.out.println("<------ Product Info ----------->");
			System.out.println("Product Name:"+product.getName()+" Id:"+product.getId()+" Sku:"+product.getSku());
		}catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
	}
	
	@Test
	void activeProduct() {
		try {
			boolean status = true;
			List<Product> product = productRepository.getAllActiveProduct(status);
			product.forEach((p)->{
				System.out.println(p.toString());
			});
		}catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
	
	@Test
	void productByCat() {
		try {
			Long catId = 1L;
			List<Product> products = productRepository.getAllProductByCategory(catId);
			ProductList productList = new ProductList();
			productList.setProductList(products);
			System.out.println(productList.toString());
		}catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}*/
	
	@Test
	void productWithCategory() {
		try {
			String catName = "Food";
			List<Object[]> getProduct = productRepository.productWithCategory(catName);
			System.out.println(getProduct.toString());
			System.out.println("Hello");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
