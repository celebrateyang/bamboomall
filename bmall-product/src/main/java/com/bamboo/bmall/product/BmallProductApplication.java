package com.bamboo.bmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.bamboo.bmall.product.dao")
@SpringBootApplication
public class BmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmallProductApplication.class, args);
	}

}
