<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="header.jsp" %>
index.jsp파일입니다.<br>
<a href="/sample/member?id=abcd&pw=1234&name=정자바">회원가입</a> <!-- a태그는 기본적으로 get 방식  -->
<form action="/sample/memberDTO" method = "post"> <!-- method가 post되면 SampleController 의 RequestMethod.GET가 RequestMethod.POST로 바뀜 ( POST )방식을 쓰려면 form의 method에 post를 써주는 방법밖에 없음 -->
	<div> id : <input type = "text" name="id"> </div>
	<div> pw : <input type = "password" name="pw"> </div>
	<div> name : <input type = "text" name="name"> </div>
	<input type = "submit" value = "회원가입">
</form>
${yyyy}
</body>
</html>