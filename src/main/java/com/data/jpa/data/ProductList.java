package com.data.jpa.data;

import java.util.List;

import com.data.jpa.model.Product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ProductList {
	private List<Product> productList;
	private Long categotyId;
	private String categoryName;
	

	public Long getCategotyId() {
		return categotyId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategotyId(Long categotyId) {
		this.categotyId = categotyId;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "ProductList [productList=" + productList + ", categotyId=" + categotyId + ", categoryName="
				+ categoryName + "]";
	}

	
}
