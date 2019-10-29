package com.ashutosh.rentacar.demoapplication.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	//@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@GetMapping("/hello")
	public String greeting() {
		
		return "Hello Spring Boot";
	}
	
	    //@RequestMapping(value = "/hello", method = RequestMethod.POST)
		@PostMapping("/hello")
		public String greeting2() {
			
			return "Hello Spring Boot from POST";
		}

}
