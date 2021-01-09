package com.bamboo.bmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName BmallCouponApplication
 * @Description BmallCouponApplication
 * @Author zhuqyang
 * @Date 2020/12/19 14:30
 * @Version 1.0
 */
@MapperScan("com.bamboo.bmall.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class BmallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(BmallCouponApplication.class, args);
    }
}
