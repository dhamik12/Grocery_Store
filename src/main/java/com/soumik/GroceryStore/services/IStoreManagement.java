package com.soumik.GroceryStore.services;

import java.util.Optional;

import com.soumik.GroceryStore.entity.Product;

public interface IStoreManagement {
	
	Product addItem(Product product);
	Iterable<Product> addBatchItem(Iterable<Product> ProductList);
	Product updateProduct(Product product);
	Optional<Product> checkAvaibilityByID(Integer id);
	Long totalProductCount();
	void removeItem(Integer id);
	
	

}
