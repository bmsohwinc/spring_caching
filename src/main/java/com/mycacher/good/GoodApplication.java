package com.mycacher.good;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class GoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodApplication.class, args);
	}

}
