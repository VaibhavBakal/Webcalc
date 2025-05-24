package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calc {
	@GetMapping("calc/{operation}/{a}/{b}")
	int calculation(@PathVariable("operation")String operation,@PathVariable("a")int a,@PathVariable("b")int b){
		 
		if(operation.equals("add")) {
			return a+b;
		}
		
		if(operation.equals("sub")) {
			return a-b;
		}
		
		if(operation.equals("mul")) {
			return a*b;
		}
		
		if(operation.equals("div")) {
			return a/b;
		}
		
		return 0;
		
		
		
	   }
}