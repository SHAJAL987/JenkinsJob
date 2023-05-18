package com.data.jpa.testcase;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.data.jpa.model.ProductCategory;
import com.data.jpa.repository.ProductCategoryRepository;

@SpringBootTest
class ProductCategoryRepositoryTest {
	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	
	@Test
	void createProductCatAll() {
		//product cat - 1
		ProductCategory productCategory = new ProductCategory();
		productCategory.setProductCategoryNaame("Food");
		//product cat - 2
		ProductCategory productCategory1 = new ProductCategory();
		productCategory1.setProductCategoryNaame("Health & Wellness");
		//product cat - 3
		ProductCategory productCategory2 = new ProductCategory();
		productCategory2.setProductCategoryNaame("Baby Care");
		
		//product cat - 4
		ProductCategory productCategory3 = new ProductCategory();
		productCategory3.setProductCategoryNaame("Personal Care");
		
		productCategoryRepository.saveAll(List.of(productCategory,productCategory1,productCategory2,productCategory3));
	}
}
