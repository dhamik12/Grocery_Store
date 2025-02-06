package com.soumik.GroceryStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.soumik.GroceryStore.services.SelectOperationType;


@SpringBootApplication
public class GroceryStoreApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext	context=SpringApplication.run(GroceryStoreApplication.class, args);
	System.out.println(context.getClass().getName());
	System.out.println("*****************************");
	System.out.println("*****Welcome to Meijer*******");
	System.out.println("*********Since-1934************");
	System.out.println("*****************************");
	
	SelectOperationType select=context.getBean(SelectOperationType.class);
	select.task();
	
	//storeManagement.addItem()
	
	}

}
