package com.sjh.signup;

public interface SignupService {
	 
    //회원가입 Service
    public void insertMember(SignupVO signVO);
    //아이디 중복 체크
	public int idcheck(String userid);
 
    
}
