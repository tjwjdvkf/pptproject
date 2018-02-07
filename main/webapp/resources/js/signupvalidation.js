function DosignUp() {
	
	var userid = $("#userid").val();
	var userpwd = $("#userpwd").val();
	var inputPwdCfm = $("#signUpUserPwdCfm").val();
	var username = $("#username").val();
	var email = $("#email").val();
	var addr1 = $("#addr1").val();
	var addr2 = $("#addr2").val();
	var addr3 = $("#addr3").val();
	
	if(userid.length == 0){
		alert("아이디를 입력해 주세요"); 
		$("#userid").focus();
		return false;
	}
	
	if(userpwd.length == 0){
		alert("비밀번호를 입력해 주세요"); 
		$("#userpwd").focus();
		return false;
	}

	if(userpwd != inputPwdCfm){
		alert("비밀번호가 서로 다릅니다. 비밀번호를 확인해 주세요."); 
		$("#signUpUserPwd").focus();
		return false; 
	}

	if(username.length == 0){
		alert("이름을 입력해주세요");
		$("#username").focus();
		return false;
	}
	
	if(email.length == 0){
		alert("이메일을 입력해주세요");
		$("#email").focus();
		return false;
	}
	
	if(addr1.length == 0 || addr2.length == 0 || addr3.length == 0 ){
		alert("주소를 입력해주세요");
		$("#addr3").focus();
		return false;
	}
	
	if(confirm("회원가입을 하시겠습니까?")){
		alert("회원가입을 축하합니다");
		return true;
	}
	
}