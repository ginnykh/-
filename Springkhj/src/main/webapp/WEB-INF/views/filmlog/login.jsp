<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="/resources/css/filmlog/login.css">   
</head>
<body>
<div id = "wrap">
<%@ include file="header.jsp" %>
<div id="container">
            <div id="loginBox">
                <form action="" id="login">
                    <div id="box">
                        <div id="id">
                            <p class="subTxt1">
                                id
                                <a href="">아이디를 잊으셨나요?</a>
                            </p>
                            <p>
                                <input type="text" id="inputBox">
                                <input type="checkbox" id="idCheck">
                                <span>id 저장</span>
                            </p>
                            
                        </div>
                        <div id="password" >
                            <p class="subTxt2">
                                Password
                            </p>
                            <p>
                                <input type="password" id="inputBox">
                            </p>
                        </div>
                    </div>
                    <button class="btnLogin" type="submit">LOGIN</button>
                </form>
            </div>
            
        </div> <!--#container-->
        <%@ include file="footer.jsp" %>
        </div>
</body>
</html>
