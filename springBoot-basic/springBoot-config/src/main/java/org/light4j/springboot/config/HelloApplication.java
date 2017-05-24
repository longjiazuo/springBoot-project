package org.light4j.springboot.config;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class HelloApplication {
	public static void main(String[] args) {
		// SpringApplication.run(HelloApplication.class, args);
		/**
		 * 关闭Banner方法一
		 */
		// SpringApplication application = new
		// SpringApplication(HelloApplication.class);
		// application.setBannerMode(Banner.Mode.OFF);
		// application.run(args);
		
		/**
		 * 关闭Banner方法二
		 */
		new SpringApplicationBuilder(HelloApplication.class).bannerMode(Banner.Mode.OFF).run(args);
	}
}