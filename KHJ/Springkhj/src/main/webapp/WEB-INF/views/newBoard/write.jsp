<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="#" method="post" id="target">
                <legend>글쓰기</legend>
                  <table>
                    <tr>
                      <td><input type="text" placeholder="제목을 입력해주세요." class="title" id="tCount"></td>
                    </tr>
                    <tr>
                      <td><textarea name="" id="text" cols="100" rows="15" placeholder="내용을 입력해주세요." class="text"></textarea></td>
                    </tr>
                  </table>
                  <p class="countTitle"><span id="countTi"></span>/100</p>
                  <p class="countText"><span id="countT"></span>/2000</p>
                  <input type="submit" value="등록" class="sub">
     </form>
</body>
</html>