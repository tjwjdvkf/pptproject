package com.sjh.signup;

public interface SignupDAO {
    //ȸ������ DAO
    public void insertMember(SignupVO signVO);
    //���̵� �ߺ�üũ
	public int idcheck(String userid);
 
}

