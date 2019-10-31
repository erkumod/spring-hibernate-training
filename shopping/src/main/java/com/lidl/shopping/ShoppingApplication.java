package com.lidl.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.lidl.shopping.service", "com.lidl.shopping.persistence"})
public class ShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}

}
