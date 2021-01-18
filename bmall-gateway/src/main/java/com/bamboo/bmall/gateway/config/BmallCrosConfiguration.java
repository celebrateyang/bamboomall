package com.bamboo.bmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @ClassName BmallCrosConfiguration
 * @Description BmallCrosConfiguration
 * @Author zhuqyang
 * @Date 2021/1/18 22:09
 * @Version 1.0
 */
@Configuration
public class BmallCrosConfiguration {
    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration configuration = new CorsConfiguration();
        // 配置跨域
        configuration.addAllowedHeader("*");
        configuration.addAllowedMethod("*");
        //允许所有来源
        configuration.addAllowedOrigin("*");
        //允许携带cookie
        configuration.setAllowCredentials(true);
        source.registerCorsConfiguration("/**",configuration);
        return new CorsWebFilter(source);
    }
}
