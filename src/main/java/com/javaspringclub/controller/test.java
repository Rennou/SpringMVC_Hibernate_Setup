package com.javaspringclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@RequestMapping("/test")
@Controller
public class test {

	
	@RequestMapping("/abc")
	public  ModelAndView  getT() {
		 ModelAndView t = new  ModelAndView ();
		 t.setViewName("tt");
		
		return t ;
		
	}

	
	
	
	
	
}
