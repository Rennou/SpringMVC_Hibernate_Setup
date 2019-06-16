package com.javaspringclub.dao;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.javaspringclub.entity.Product;





@Repository
@Transactional

public class dao {

	@PersistenceContext
	private EntityManager em;
	
	
	
	@Transactional
	public void addProoduct(Product p) {
		
		
		
	
		em.merge(p);
	
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Product> findAll(){
		
	return  em.createQuery("select p from Product p").getResultList();
		
	}
	
	
	@Transactional
	@SuppressWarnings("unchecked")
	public   ResponseEntity<Product> findPoduct(String code){
	
		RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:8091/products/1111";
	    URI uri = null;
		try {
			uri = new URI(baseUrl);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	    ResponseEntity<Product> result = restTemplate.getForEntity(uri, Product.class);
		
		
		
		
	return  result ;
		
	}
}
