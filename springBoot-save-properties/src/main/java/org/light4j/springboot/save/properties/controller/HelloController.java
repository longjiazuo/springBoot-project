package org.light4j.springboot.save.properties.controller;

import org.light4j.springboot.save.properties.config.ArticleSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
    private ArticleSettings articleSettings; //①
	
	@RequestMapping("/")
	public String hello() {
		return "article name is "+ articleSettings.getName()+" and article author is "+articleSettings.getAuthor();
	}
}