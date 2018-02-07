package com.sjh.signup;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class SignupDAOImpl implements SignupDAO {
 
    @Inject
    private SqlSession session;
 
    @Override
    public void insertMember(SignupVO signVO) {
        session.insert("insertMember",signVO);
    }
}
