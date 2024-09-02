package com.example.security_mybatis;

import com.example.security_mybatis.vo.MemberVO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SecurityMybatisApplication {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	public static void main(String[] args) {
//		MemberVO kim = new MemberVO();
//		kim.setId("kim");
//		kim.setPwd(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("kim"));
//		kim.setName("김유신");
//		kim.setRole("user");
//
//		MemberVO lee = new MemberVO();
//		lee.setId("lee");
//		lee.setPwd(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("lee"));
//		lee.setName("이순신");
//		lee.setRole("admin");
//
//		DBManager.insert(kim);
//		DBManager.insert(lee);
		SpringApplication.run(SecurityMybatisApplication.class, args);
	}

}
