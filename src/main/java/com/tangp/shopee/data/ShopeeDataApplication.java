package com.tangp.shopee.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ShopeeDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopeeDataApplication.class, args);
	}

}
