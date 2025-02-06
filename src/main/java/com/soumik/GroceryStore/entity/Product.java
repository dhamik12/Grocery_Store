package com.soumik.GroceryStore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="grocery_store")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@Column(name="productid")
	private Integer productId;
	@Column(name="productcategory")
	private String productCategory;
	@Column(name="companyname")
	private String companyName;
	@Column(name="productname")
	private String productName;
	@Column(name="productprice")
	private Integer productPrice;
	
	
	

}
