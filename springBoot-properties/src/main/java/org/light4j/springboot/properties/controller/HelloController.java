package org.light4j.springboot.properties.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${book.author}")
	private String bookAuthor;
	@Value("${book.name}")
	private String bookName;

	@RequestMapping("/")
	public String hello() {
		return "book name is:" + bookName + " and book author is:" + bookAuthor;
	}
}
