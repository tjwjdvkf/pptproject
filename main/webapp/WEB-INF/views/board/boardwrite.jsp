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
<title>공지사항 작성</title>
</head>
<script type="text/javascript">
	function fn_MoveToUrl(url,msg){
		var ntitle = $("#ntitle").val();
		var ncontent = $("#ncontent").val();
		
		if(ntitle.length == 0){
			 alert("제목을 입력해 주세요");  
			$("#ntitle").focus();
			return false;
	
		}
		
		if(ncontent.length == 0){
			 alert("내용을 입력해 주세요");  
			$("#ncontent").focus();
			return false;
		}
		
		if(msg){
			if(confirm(msg + "하시겠습니까???"))
			$("#boardFrm").submit();
			return;
		}
		location.href=url;
	}
</script>
<body>
<div class="page-wrapper">
	<div class="container-fluid">
		<div class="col-lg-8"><!--게시판 넓이 -->
			<div class="col-lg-12">
	            <h1 class="page-header">공지사항 관리</h1>
	        </div>
	        <div class="row">
          		<div class="col-lg-12">
          		
          		</div>
          	</div>
	        <div class="panel panel-default">
	        	<div class="panel-heading">공지사항 </div>
	        	<div class="panel-body">
	        		<form id="boardFrm" name="boardFrm" action="/board/boardSave.do" method="post">
		        		<div class="row form-group">
	                        <label class="col-lg-2">제목</label>
	                        <div class="col-lg-8">
	                        	<input type="text" class="form-control" id="ntitle" name="ntitle" min="1" max="3">
	             	  	  </div>
	                    </div>
	                   	<div class="row form-group">
	                       <label class="col-lg-2">내용</label>
	                       <div class="col-lg-8">
	                       	<textarea class="form-control" id="ncontent" name="ncontent"></textarea>
	                       </div>
	                   </div>
                  </form>
	                   <button class="btn btn-outline btn-info" onclick="fn_MoveToUrl('/board/boardSave.do','저장')">저장하기</button>
			       	   <button class="btn btn-outline btn-primary" onclick="location.href='/board/boardList.do'">리스트</button>
	        	</div>
	        </div>
		</div>
	</div>
</div>
</body>
</html>