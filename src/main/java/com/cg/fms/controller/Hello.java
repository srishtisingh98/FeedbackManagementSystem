package com.cg.fms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {
	
	@ResponseStatus(code = HttpStatus.OK)
	@GetMapping("/greet")
	public String greet() {
		return "<h1> Hi Srishti </h1>";
	}
}
