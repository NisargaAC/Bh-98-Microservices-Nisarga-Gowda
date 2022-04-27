package com.example.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class Marks {

		// TODO Auto-generated method stub
		@RequestMapping("/grades/{name}/{marks}")
		public  String Student(@PathVariable String name, @PathVariable int marks) { if (marks >= 90 && marks <= 100) {
		return name + "You Scored Grade-A";
		} else if (marks >= 80 && marks <= 90) {
		return name + "You Scored Grade-B";
		} else if (marks >= 70 && marks <= 80) {
		return name + "You Scored Grade-C";
		} else {
		return name + "You are Fail";
		}

	}

}
