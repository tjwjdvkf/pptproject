package com.sjh.signup;

public interface SignupDAO {
    //회원가입 DAO
    public void insertMember(SignupVO signVO);
    //아이디 중복체크
	public int idcheck(String userid);
 
}

