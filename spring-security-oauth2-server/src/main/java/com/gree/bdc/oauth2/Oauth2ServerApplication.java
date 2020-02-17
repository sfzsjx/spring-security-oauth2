package com.gree.bdc.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * 认证服务器 用于获取token
 * </p>
 * @author hadoop
 */
@SpringBootApplication
public class Oauth2ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2ServerApplication.class,args);
    }
}
