package com.example.security_mybatis.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class BookController {
    //버전 내린 상태니까 javax로, 버전 올릴 시 jakarta로
    @GetMapping("/listBook")
    public void list(HttpSession session) {

        //인증된(로그인된) 회원의 정보를 갖고 오기 위하여
        //먼저 시큐리티의 인증 객체가 필요합니다.
        //얘가 인증객체
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        //이 인증객체를 통하여 인증된(로그인한) User객체를 받아옵니다.
        User user = (User)authentication.getPrincipal();

        //이 인증된 User를 통해서 로그인한 회원의 아이디를 갖고 옵니다.
        String id = user.getUsername();

        //이 정보는 세션에 저장하고 뷰 페이지에서 출력하도록 해봅니다.
        session.setAttribute("id", id);
    }
}