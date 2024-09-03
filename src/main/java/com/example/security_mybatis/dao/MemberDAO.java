package com.example.security_mybatis.dao;

import com.example.security_mybatis.DBManager;
import com.example.security_mybatis.vo.MemberVO;
import org.springframework.stereotype.Repository;



@Repository
public class MemberDAO {

    public int insert(MemberVO m) {
        return DBManager.insert(m);
    }
}
