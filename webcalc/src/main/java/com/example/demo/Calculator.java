package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Calculator {
	@GetMapping("add/{n1}/{n2}")
	int add(@PathVariable("n1") int n1,@PathVariable("n2")int n2) {
		return n1+n2;
	}
	@GetMapping("sub/{n1}/{n2}")
	int sub(@PathVariable("n1")int n1,@PathVariable("n2")int n2) {
		
		return n1-n2;
	}
	
	@GetMapping("mul/{n1}/{n2}")
	int mul(@PathVariable ("n1")int n1,@PathVariable("n2")int n2) {
		
		return n1*n2;
	}
	
	@GetMapping("div/{n1}/{n2}")
	int div(@PathVariable("n1")int n1,@PathVariable("n2")int n2) {
		
		return n1/n2;
	}
	
	

}
