package com.javaspringclub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.javaspringclub.dao.dao;
import com.javaspringclub.entity.Product;



@Service

public class ProductService {

	@Autowired 
	dao daoP ;
	
	public ProductService() {
		
	}

	public void  addp(Product p) {
	
		daoP.addProoduct(p);
		
	}
	
	public List<Product> findAll(){
		
	return daoP.findAll();
		
	}
	
	public  Product findProduct(String code ){
		
		return daoP.findPoduct(code);
			
		}
}
