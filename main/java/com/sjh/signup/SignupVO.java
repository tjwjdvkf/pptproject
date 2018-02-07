package com.sjh.signup;

import java.util.Date;

public class SignupVO {

	private String userid;
    
    private String userpwd;
    
    private String username;
    
    private String email;
    
    private String addr1;
    private String addr2;
    private String addr3;
    
    private Date rdate;
    
    private Date updatedate;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getAddr3() {
		return addr3;
	}

	public void setAddr3(String addr3) {
		this.addr3 = addr3;
	}

	public Date getRdate() {
		return rdate;
	}

	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	@Override
	public String toString() {
		return "SignupVO [userid=" + userid + ", userpwd=" + userpwd + ", username=" + username + ", email=" + email
				+ ", addr1=" + addr1 + ", addr2=" + addr2 + ", addr3=" + addr3 + ", rdate=" + rdate + ", updatedate="
				+ updatedate + "]";
	}
    
    
}
