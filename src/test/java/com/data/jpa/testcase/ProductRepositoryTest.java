package com.data.jpa.testcase;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.data.jpa.model.Product;
import com.data.jpa.repository.ProductRepository;


@SpringBootTest
class ProductRepositoryTest {
	
	@Autowired
	private ProductRepository productRepository;
	

	/*@Test
	void saveMethod() {
		//create product
		Product product = new Product();
		product.setName("Orange");
		product.setSku("001AO");
		product.setDescription("This is a Orange product");
		product.setImageUrl("orangeimage.png");
		product.setPrice(new BigDecimal(400));
		product.setActive(true);
		
		//save product
		Product saveProduct = productRepository.save(product);
		
		//display product
		System.out.println("Product Id: "+saveProduct.getId()+" Product Name: "+saveProduct.getName());
		System.out.println(saveProduct.toString());
		
	}
	
	@Test
	void updateProduct() {
		Long id = 3L;
		
		//Collect update Product
		Product product = productRepository.findById(id).get();
		product.setName("Coconut");
		product.setDescription("This is a Coconut Product");
		
		//save product
		productRepository.save(product);
		
		//display product
		System.out.println("--- Updated Product Info---");
		System.out.println(product.toString());
	}
	
	@Test
	void findByIdproduct() {
		Long id = 3L;
		Product product = productRepository.findById(id).get();
		System.out.println("--- Find by Id Product Info---");
		System.out.println("Id:"+product.getId()+" Name:"+product.getName()+" Description:"+product.getDescription());
	}
	
	@Test
	void saveAllProduct() {
		//create product
		Long cat = 1L;
		Product product = new Product();
		product.setName("Product-1");
		product.setSku("p01");
		product.setDescription("This is product01");
		product.setImageUrl("product01.png");
		product.setPrice(new BigDecimal(400));
		product.setActive(true);
		product.setCategoryId(cat);
		
		//create product
		Product product1 = new Product();
		product1.setName("Product-2");
		product1.setSku("p02");
		product1.setDescription("This is product02");
		product1.setImageUrl("product02.png");
		product1.setPrice(new BigDecimal(400));
		product1.setActive(true);
		product1.setCategoryId(cat);
		//create product
		Product product2 = new Product();
		product2.setName("Product-3");
		product2.setSku("p03");
		product2.setDescription("This is product02");
		product2.setImageUrl("product03.png");
		product2.setPrice(new BigDecimal(400));
		product2.setActive(true);
		product2.setCategoryId(cat);
		
		productRepository.saveAll(List.of(product,product1,product2));
	}
	
	@Test
	void finAllProduct() {
		List<Product> product = productRepository.findAll();
		product.forEach((p)->{
			System.out.println("Id:"+p.getId()+" Name:"+p.getName());

		});
	}*/
	
	void deleteBuIdProduct() {
		Long id = 6L;
		Product product = productRepository.findById(id).get();
		productRepository.delete(product);
		System.out.println("Deleted Product Id: "+id);
	}
	
	
	
}
