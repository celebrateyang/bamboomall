package com.bamboo.bmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
//因为引入common时,有mybatis数据源相关依赖,需要指定数据源.这里网关应用暂不需要数据源,可以用以下注解排除
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BmallGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmallGatewayApplication.class, args);
	}

}
