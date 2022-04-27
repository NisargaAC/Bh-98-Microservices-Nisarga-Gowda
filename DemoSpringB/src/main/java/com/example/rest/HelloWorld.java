package com.example.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "Hello from my spring boot application!";
	}
	@RequestMapping("/calculate/{a}/{b}")

	String calculate(@PathVariable Double a,@PathVariable Double b) {
	double x = a+b;
	double y = a-b;
	double z = a*b;
	double k = a/b;
	return "Add = "+x +"Sub = "+y +"Mul = "+z +"Div = "+k;
	}
}


