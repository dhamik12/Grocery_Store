package com.soumik.GroceryStore.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soumik.GroceryStore.entity.Product;

@Component
public class SelectOperationType {
	
	Scanner sc=null;
	
	@Autowired
	StoreManagement storeManage;
	
	public void task() {
		
		System.out.println("Insert Single Product--->  press 1");
		System.out.println("Insert Batch Product--->  press 2");
		System.out.println("Update Existing Product--->  press 3");
		System.out.println("Check Avaibility by Id---> press 4");
		System.out.println("Count Total Number Of Product--->  press 5");
		System.out.println("Remove Any Product by Id---> 6");
		
		
		System.out.println("Enter Your Choice :");
		sc=new Scanner(System.in);
		int choice=sc.nextInt();
		sc.nextLine();
		System.out.println("You have selected :"+ choice);
		
		switch(choice) {
		
		case 1: 
			System.out.println("Insert Single Product-");
			Product p=new Product();
			System.out.println("Enter Product Id");
			int id=sc.nextInt();
			sc.nextLine();
			p.setProductId(id);;
			System.out.println("Enter Product Categoty :");
			String category=sc.nextLine();
			p.setProductCategory(category);
			System.out.println("Enter Company Name :");
			String company=sc.nextLine();
			p.setCompanyName(company);
			System.out.println("Enter Product Name :");
			String name=sc.nextLine();
			p.setProductName(name);
			System.out.println("Enter Product Price :");
			Integer price=sc.nextInt();
			p.setProductPrice(price);
			
			Product pObj=storeManage.addItem(p);
			System.out.println("Product Added to DB :"+ pObj.getProductName());
			break;
			
			
			
			
		case 2:
			
			System.out.println("Insert Batch Product :");
			boolean status=true;
			List<Product> productList=new ArrayList<>();
			while(status) {
				Product p2=new Product();
				System.out.println("Enter Product Id");
				int id2=sc.nextInt();
				sc.nextLine();
				p2.setProductId(id2);
				System.out.println("Enter Product Categoty :");
				String category2=sc.nextLine();
				p2.setProductCategory(category2);
				System.out.println("Enter Company Name :");
				String company2=sc.nextLine();
				p2.setCompanyName(company2);
				System.out.println("Enter Product Name :");
				String name2=sc.nextLine();
				p2.setProductName(name2);
				System.out.println("Enter Product Price :");
				Integer price2=sc.nextInt();
				p2.setProductPrice(price2);
				
				productList.add(p2);
				
				System.out.println("Want To Add Another Product---> press 1");
				System.out.println("Exit---> press 2");
				int wish=sc.nextInt();
				if(wish==1) {
					System.out.println("Please Continue..");
				}
				
				else {
					
					status=false;
				}
			}
		
		
			Iterable<Product> list=storeManage.addBatchItem(productList);
			System.out.println("Products updated to DB :"+ list);
			break;
			
			
			
			
			
		case 3:
			
			System.out.println("Update Existing  Product");
			Product p3=new Product();
			System.out.println("Enter Product Id");
			int id3=sc.nextInt();
			sc.nextLine();
			p3.setProductId(id3);
			System.out.println("Enter Product Categoty :");
			String category3=sc.nextLine();
			p3.setProductCategory(category3);
			System.out.println("Enter Company Name :");
			String company3=sc.nextLine();
			p3.setCompanyName(company3);
			System.out.println("Enter Product Name :");
			String name3=sc.nextLine();
			p3.setProductName(name3);
			System.out.println("Enter Product Price :");
			Integer price3=sc.nextInt();
			p3.setProductPrice(price3);
			
			Product pObj3=storeManage.addItem(p3);
			System.out.println("Product Updated to DB :"+ pObj3.getProductName());
			break;
			
			
			
		case 4:
			
			System.out.println("Check Avaibility By ID");
			System.out.println("Enter Product Id :");
			int id4=sc.nextInt();
			sc.nextLine();
			Optional<Product> pObj4=storeManage.checkAvaibilityByID(id4);
			System.out.println("The Product is :"+ pObj4);
			break;
			
		case 5:
			
			System.out.println("Count Total Number Of Product");
			Long count=storeManage.totalProductCount();
			System.out.println("The Total Number of Product Listed is "+ count);
			break;
			
		case 6: 
			
			System.out.println("Remove Product By ID");
			System.out.println("Enter Product Id :");
			int id6=sc.nextInt();
			storeManage.removeItem(id6);
			System.out.println("Product is removed from DB");
			break;
		}
		
		
	
			

		
		
	}
}
