<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
  <script src="/resources/js/addressapi.js"></script>
  <script src="/resources/js/signupvalidation.js"></script>
  <script src="http://code.jquery.com/jquery-2.2.4.js"></script>
<title>회원가입</title>
</head>
<script type="text/javascript">
//아이디 체크여부 확인 (아이디 중복일 경우 = 0 , 중복이 아닐경우 = 1 )
var idck = 0;
$(function() {
	//idck 버튼을 클릭했을 때 
	$("#idck").click(function() {
		
		//userid 를 param.
		var userid =  $("#userid").val(); 
		
		$.ajax({
			async: true,
			type : 'POST',
			data : userid,
			url : "idcheck.do",
			dataType : "json",
			contentType: "application/json; charset=UTF-8",
			success : function(data) {
				if (data.cnt > 0) {
					
					alert("아이디가 존재합니다. 다른 아이디를 입력해주세요.");
					//아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
					$("#divInputId").addClass("has-error")
					$("#divInputId").removeClass("has-success")
					$("#userid").focus();
					
				
				} else {
					alert("사용가능한 아이디입니다.");
					//아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
					$("#divInputId").addClass("has-success")
					$("#divInputId").removeClass("has-error")
					$("#userpwd").focus();
					//아이디가 중복하지 않으면  idck = 1 
					idck = 1;
					
				}
			},
			error : function(error) {
				
				alert("error : " + error);
			}
		});
	});
});


</script>
<body>
<div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-3" style="width: 50%">
                <div class="login-panel panel panel-default" style="margin-top: 10%; margin-bottom: 10%;">
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Sign Up</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form" name="frm" id="frm" action="/signup/signup.do" method="post">
                        <!-- <form role="form"> -->
                            <fieldset>
                            	<div class="form-group" id="divInputId">
                            		<label>아이디</label>
                            		<input class="form-control" style="margin-bottom: 5px;" placeholder="아이디" name="userid" id="userid" type="text" />
                            		<input type="button" class="btn btn-default" style="width: 30%;" value="중복확인" name="idck" id="idck"/>
                            	</div>
                            	<div class="form-group">
                            		<label>비밀번호</label>
                            		<input class="form-control" placeholder="비밀번호" name="userpwd" id="userpwd" type="password" />
                            	</div>
                            	<div class="form-group">
                            		<label>비밀번호 확인</label>
                            		<input class="form-control" placeholder="비밀번호 확인" name="signUpUserPwdCfm" id="signUpUserPwdCfm" type="password" />
                            	</div>
                            	<div class="form-group">
                            		<label>이름</label>
                            		<input class="form-control" placeholder="이름" name="username" id="username" type="text" />
                            	</div>
                            	<div class="form-group">
                            		<label>이메일</label>
                            		<input class="form-control" placeholder="이메일" name="email" id="email" type="text" />
                            	</div>
                            	<div class="form-group">
                            		<label style="display: block;" >주소</label>
                            		<input class="form-control" style="width: 40%; display: inline;" placeholder="우편번호" name="addr1" id="addr1" type="text" readonly="readonly" >
                            		<button type="button" class="btn btn-default" onclick="execPostCode();"><i class="fa fa-search"></i> 우편번호 찾기</button>
                            		
                            	</div>
                            	<div class="form-group">
                            		<input class="form-control" style="top: 5px;" placeholder="도로명 주소" name="addr2" id="addr2" type="text" readonly="readonly" />
                            	</div>
                            	<div class="form-group">
                            		<input class="form-control" placeholder="상세주소" name="addr3" id="addr3" type="text"  />
                            	</div>
                            	<input type="button" class="btn btn-lg btn-success btn-block"  value="회원가입" onclick="DosignUp();" />
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>
</html>