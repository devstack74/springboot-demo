package com.poc.spring.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello")
public class HelloController {

	@RequestMapping(path="/{name}", method = RequestMethod.GET)
	public String helloWithName(@PathVariable String name){
		return "Hi "+name;
	}
	
}
