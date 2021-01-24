package com.bamboo.bmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
* mybatisplus配置逻辑删除步骤
* 1. 配置全局的逻辑删除规则(可省略)
* 2. 配置逻辑删除的bean(已省略,因为是3.1以后版本)
* 3. 给bean加上逻辑删除注解@
* */

@EnableDiscoveryClient
@MapperScan("com.bamboo.bmall.product.dao")
@SpringBootApplication
public class BmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmallProductApplication.class, args);
	}

}
