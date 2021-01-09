package com.bamboo.bmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.bamboo.bmall.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class BmallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmallMemberApplication.class, args);
	}

}
