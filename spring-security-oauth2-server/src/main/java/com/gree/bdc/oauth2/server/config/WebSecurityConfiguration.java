package com.gree.bdc.oauth2.server.config;

import com.gree.bdc.oauth2.server.config.service.UserDetailsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author hadoop
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true,jsr250Enabled = true)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService(){
        return new UserDetailsServiceImpl();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //基于内存的方式
//        auth.inMemoryAuthentication()
//                .withUser("admin").password(passwordEncoder().encode("123456")).roles("ADMIN")
//                .and()
//                .withUser("user").password(passwordEncoder().encode("123456")).roles("USER");

        //基于RBAC数据认证授权模型
        auth.userDetailsService(userDetailsService());
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/oauth/check_token");
    }
}
