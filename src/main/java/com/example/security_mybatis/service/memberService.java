package com.example.security_mybatis.service;

import com.example.security_mybatis.DBManager;
import com.example.security_mybatis.vo.MemberVO;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class memberService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MemberVO m = DBManager.findById(username);
        if(m==null){
            throw new UsernameNotFoundException(username);
        }
//
//        UserDetails details = null;
//        User.UserBuilder builder =User.builder();
//        builder.username(m.getId());
//        builder.password(m.getPwd());
//        builder.roles(m.getRole());
//        details = builder.build();
//        return details;

        System.out.println("회원아이디"+username);
        return User.builder()
                .username(m.getId())
                .password(m.getPwd())
                .roles(m.getRole())
                .build();
    }
}
