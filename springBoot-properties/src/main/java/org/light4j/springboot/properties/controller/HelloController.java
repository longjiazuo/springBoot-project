package org.light4j.springboot.properties.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${article.author}")
	private String articleAuthor;
	@Value("${article.name}")
	private String articleName;

	@RequestMapping("/")
	public String hello() {
		return "article name is:" + articleName + " and article author is:" + articleName;
	}
}