package com.work;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiEndpoints {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getHelloMessage() {
		return "Hello";
	}
	
	@RequestMapping(value="/check",method=RequestMethod.GET)
	public String getHelloMessage2() {
		return "Hello";
	}

}
