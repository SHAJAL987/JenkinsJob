package com.data.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
		name = "product_category"
)
public class ProductCategory {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "product_cat_gen"
	)
	@SequenceGenerator(
			name = "product_cat_gen",
			sequenceName = "product_cat_id_seq",
			allocationSize = 1
	)
	private Long id;
	@Column(name = "PROD_CAT_NAME")
	private String productCategoryNaame;
	public Long getId() {
		return id;
	}
	public String getProductCategoryNaame() {
		return productCategoryNaame;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setProductCategoryNaame(String productCategoryNaame) {
		this.productCategoryNaame = productCategoryNaame;
	}
	@Override
	public String toString() {
		return "ProductCategory [id=" + id + ", productCategoryNaame=" + productCategoryNaame + "]";
	}
	
	

}
