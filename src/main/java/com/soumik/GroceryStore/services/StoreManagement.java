package com.soumik.GroceryStore.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soumik.GroceryStore.entity.Product;
import com.soumik.GroceryStore.entity.ProductRepo;

@Component
public class StoreManagement implements IStoreManagement {
	
	@Autowired
	ProductRepo repo;

	@Override
	public Product addItem(Product product) {
		
	  Product p=  repo.save(product);
	  return p;
	   
	}

	@Override
	public Iterable<Product> addBatchItem(Iterable<Product> productList) {
		
		return repo.saveAll(productList);
		
	}

	@Override
	public Product updateProduct(Product product) {
		
		return repo.save(product);
	}

	@Override
	public Optional<Product> checkAvaibilityByID(Integer id) {
		
		return repo.findById(id);
		
	
	}

	@Override
	public Long totalProductCount() {
		
		return repo.count();
	}

	@Override
	public void removeItem(Integer id) {
		 repo.deleteById(id);
		
	}
	

	

}
