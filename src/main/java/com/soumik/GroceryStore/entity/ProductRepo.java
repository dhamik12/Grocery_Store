package com.soumik.GroceryStore.entity;
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product,Serializable>
{
	
	

}
