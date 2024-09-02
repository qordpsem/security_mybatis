package com.example.security_mybatis;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests().mvcMatchers("/","/join","/all/**","/error").permitAll()
                .mvcMatchers("/admin/**").hasRole("admin")
                .anyRequest().authenticated();

        http.formLogin().loginPage("/login").permitAll()
                .defaultSuccessUrl("/listBook");

        http.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .invalidateHttpSession(true).logoutSuccessUrl("/login");

        http.httpBasic();
    }
}
