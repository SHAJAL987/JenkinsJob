package com.data.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.data.jpa.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	@Query("select u from Product u where u.id = :id and u.sku = :sku")
	Product getProductById(@Param("id") Long productId, @Param("sku") String productSku);
	
	@Query("select u from Product u where u.active = :status")
	List<Product> getAllActiveProduct(@Param("status") boolean status);
	
	@Query("select u from Product u where u.categoryId = :categoryId and u.active = true")
	List<Product> getAllProductByCategory(@Param("categoryId") Long categoryId);
	
	@Query("select a.id,"
			+ "a.productCategoryNaame,"
			+ "b.id,"
			+ "b.sku,"
			+ "b.name,"
			+ "b.description,"
			+ "b.price,"
			+ "b.active,"
			+ "b.imageUrl,"
			+ "b.categoryId "
			+ "from ProductCategory b JOIN b.categoryId a where a.productCategoryNaame = :productCategoryNaame")
	List<Object[]> productWithCategory(@Param("productCategoryNaame") String productCategoryNaame);
}
