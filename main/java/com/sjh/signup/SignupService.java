package com.sjh.signup;

public interface SignupService {
	 
    //ȸ������ Service
    public void insertMember(SignupVO signVO);
    //���̵� �ߺ� üũ
	public int idcheck(String userid);
 
    
}
