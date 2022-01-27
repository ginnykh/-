<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type = "text/javascript" src = "https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type = "text/javascript" src = "../resources/js/uploadAjax.js"></script>
	<link rel="stylesheet" type="text/css" href="../resources/css/all.css">
	<link rel="stylesheet" type="text/css" href="../resources/css/sb-admin-2.css">
	<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">
	<!-- 
	<script type="text/javascript" src="resources/js/write.js"></script>
	 -->
</head>
<body>
	<h1>게시판 글쓰기</h1>
	<form action="/board/write" method="post" role = "form">
	  <div class="form-group row">
	  
	    <div class="col-sm-12 mb-3 mb-sm-0">
	         <input type="text" name="title" class="form-control form-control-user" id="exampleFirstName" placeholder="title">
	    </div>
	    
		<div class="col-sm-12 mb-3 mb-sm-0">
			<textarea  name="content" rows="10" cols="20" class="form-control form-control-user" id="exampleFirstName" placeholder="content"></textarea>
		</div>
		
		<!-- 
		
		<div class="col-sm-12 mb-3 mb-sm-0">
	         <input type="text" name="fileName" class="form-control form-control-user" id="exampleFirstName" placeholder="title">
	    </div>
	    
	    <div class="col-sm-12 mb-3 mb-sm-0">
	         <input type="text" name="uuid" class="form-control form-control-user" id="exampleFirstName" placeholder="title">
	    </div>
	    
	    <div class="col-sm-12 mb-3 mb-sm-0">
	         <input type="text" name="uploadPath" class="form-control form-control-user" id="exampleFirstName" placeholder="title">
	    </div>
		
		 -->
		
		<div>
			<input type = "file" name = "uploadFile" multiple>
		</div>
		<!-- class="btn btn-primary btn-icon-split" -->
		<div class="btn btn-primary btn-icon-split">
			<input type="submit" value="글쓰기"  class="btn btn-primary btn-icon-split">
		</div>
		
	</div>
	</form>
	<div id = "uploadResult">
		<ul></ul>
	</div>
</body>
</html>