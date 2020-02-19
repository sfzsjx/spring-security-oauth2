package com.gree.bdc.oauth2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * <p>
 * 认证服务器 用于获取token
 * </p>
 * @author hadoop
 */
@SpringBootApplication
@MapperScan(basePackages = "com.gree.bdc.oauth2.server.mapper")
public class Oauth2ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2ServerApplication.class,args);
    }
}
