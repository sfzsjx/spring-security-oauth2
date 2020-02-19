package com.gree.bdc.oauth2.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author hadoop
 */
@SpringBootApplication
@MapperScan(basePackages = "com.gree.bdc.oauth2.resource.mapper")
public class Oauth2ResourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2ResourceApplication.class,args);
    }
}
