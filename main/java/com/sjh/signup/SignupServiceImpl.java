package com.sjh.signup;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class SignupServiceImpl implements SignupService {
 
    @Inject
    private SignupDAO dao;
 
    @Override
    public void insertMember(SignupVO signVO) {
        dao.insertMember(signVO);
    }
}
