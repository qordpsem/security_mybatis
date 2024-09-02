package com.example.security_mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.example.security_mybatis.vo.MemberVO;

import java.io.InputStream;

public class DBManager {
    public static SqlSessionFactory sqlSessionFactory=null;

    static{
        try {String resource = "sqlMapConfig.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
//            Reader reader = Resources.getResourceAsReader(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (Exception e) {
            System.out.println("예외발생 : " + e.getMessage());
        }
    }

    public static int insert(MemberVO m) {
        int re = -1;
        SqlSession session = sqlSessionFactory.openSession();
        re = session.insert("member.insert", m);
        session.commit();
        session.close();
        return re;
    }
    public static MemberVO findById(String id)  {
        MemberVO m = null;
        SqlSession session = sqlSessionFactory.openSession();
        session.selectOne("member.findById", id);
        session.close();
        return m;
    }
}