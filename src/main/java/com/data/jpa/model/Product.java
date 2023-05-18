package com.data.jpa.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
		name = "product",
		uniqueConstraints = {
				@UniqueConstraint(
						name = "sku_unique",
						columnNames = "SKU"
				),
				@UniqueConstraint(
						name = "name_unique",
						columnNames = "NAME"
				)
		}
)
@ToString
public class Product {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "product_generator"
	)
	@SequenceGenerator(
			name = "product_generator",
			sequenceName = "product_seq_id",
			allocationSize = 1
	)
	@Column(name = "ID")
	private Long id;
	@Column(name = "SKU", nullable = false)
	private String sku;
	@Column(name = "NAME", nullable = false)
	private String name;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "PRICE")
	private BigDecimal price;
	@Column(name = "ACTIVE")
	private boolean active;
	@Column(name = "IMG_URL")
	private String imageUrl;
	@Column(name = "CREATE_DATE")
	@CreationTimestamp
	private LocalDateTime dateCreated;
	@Column(name = "UPDATE_DATE")
	@UpdateTimestamp
	private LocalDateTime lastUpdated;
	@Column(name = "CATEGORY_ID")
	private Long categoryId;
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Long getId() {
		return id;
	}
	public String getSku() {
		return sku;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public boolean isActive() {
		return active;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", sku=" + sku + ", name=" + name + ", description=" + description + ", price="
				+ price + ", active=" + active + ", imageUrl=" + imageUrl + ", dateCreated=" + dateCreated
				+ ", lastUpdated=" + lastUpdated + "]";
	}
	
	
	
	
}
