package org.light4j.springboot.aop.controller;

import org.light4j.springboot.aop.annotation.Action;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	@Action("hello")
	public String hello() {
		return "Hello Spring Boot";
	}
}