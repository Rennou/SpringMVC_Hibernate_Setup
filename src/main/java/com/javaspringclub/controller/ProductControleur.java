package com.javaspringclub.controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bdeb.service.user.User;
import com.javaspringclub.entity.Product;
import com.javaspringclub.service.ProductService;


@Controller
public class ProductControleur {


	@Autowired
	ProductService s ;

	public ProductControleur() {

	}


	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView hello(HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}

	
	
	
	
	
	@GetMapping("/{id}")
	public ModelAndView  getP(@PathVariable String id) 
	{
		ModelAndView v = new ModelAndView();
		
		Product p = s.findProduct(id);
		
		System.out.println(p);
		v.addObject("product",s.findProduct(id)) ;
		v.setViewName("productDetail");
          return v ;
    
	}
	
	
	
	
	
	
	

	@RequestMapping(value = { "/allProduct" }, method = RequestMethod.GET)
	public ModelAndView listProduct(HttpServletResponse response) throws IOException {

		ModelAndView mv = new ModelAndView();
		mv.addObject("listeP" ,s.findAll()) ;
		mv.setViewName("allProduct");
		return mv;
	}


	@RequestMapping(path = { "/addProduct" }, method = RequestMethod.GET)
	public ModelAndView addProduct(HttpServletResponse response) throws IOException {
		Product product = new Product();
		ModelAndView mv = new ModelAndView();
		mv.addObject(product);
		mv.setViewName("addProduct");
		return mv;
	}

	@RequestMapping(path = { "/addProduct" }, method = RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute Product p, BindingResult result) throws IOException {
		ModelAndView mv = new ModelAndView();

		if(!result.hasErrors()) {
	      	s.addp(p);
			mv.setViewName("redirect:/allProduct");
		}
		else 
		{

			mv.setViewName("redirect://addProduct");
		}

		return mv ;
	}
	
	@RequestMapping(path = { "/edit/{code}" }, method = RequestMethod.GET)
	public ModelAndView editFormProduct(@PathVariable String code) throws IOException {
		System.out.println("ici1");
		ModelAndView mv = new ModelAndView();
		mv.addObject("product",s.findProduct(code));
		mv.setViewName("editProduct");
		return mv;
	}
	
	
	@RequestMapping(path = { "/editp"}, method = RequestMethod.POST)
	public ModelAndView saveEditProduct(@ModelAttribute Product p, BindingResult result) throws IOException {
		ModelAndView mv = new ModelAndView();
		System.out.println("ici3");
		if(!result.hasErrors()) {

	      	s.addp(p);
			mv.setViewName("redirect:/allProduct");
		}
		else {

			mv.setViewName("redirect://allProduct");
		}

		return mv ;
	}
}