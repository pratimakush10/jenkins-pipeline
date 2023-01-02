package com.example.demo.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworldcontroller {
	
	@GetMapping("hello")
	  public String sayHello() {
	    return "Hello Developer, you are awesome!";
	  }

}
