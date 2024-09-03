package com.example.security_mybatis.controller;

import com.example.security_mybatis.dao.MemberDAO;
import com.example.security_mybatis.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @Autowired
    private MemberDAO dao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public void loginForm(){

    }
    @GetMapping("/join")
    public void joinForm() {

    }

    //로그인의 post는 시큐리티가 해주지만 회원가입의 post는 우리가 처리해야함
    @PostMapping("/join")
    public String joinSubmit(MemberVO m) {
        String view = "redirect:/";

        //DB에 비밀번호를 인코딩해서 넣어야함
        m.setPwd(passwordEncoder.encode(m.getPwd()));

        //롤 설정
        m.setRole("user");

        dao.insert(m);
        return view;
    }
}
