package com.appname.tutorial.AppName.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${paths.whitelist}")
    private String[] authWhiteList;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.cors().disable()
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(authWhiteList).permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/secure/**").hasAnyRole("ADMIN")
                .anyRequest().permitAll();

    }
}
