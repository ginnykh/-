<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script type = "text/javascript" src = "https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type = "text/javascript" src = "../resources/js/uploadAjax.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="../resources/css/filmlog/write.css">   
</head>
<body>
<div id="container">
          <div class="containerIn">
            <section class="slide">
              <div class="slide-img">
                슬라이드
                <!-- <img src="./img/slide.PNG" alt=""> -->
              </div>
            </section>
            <div class="write">
              <form action="/filmlog/write" method="post" id="target">
                <legend>글쓰기</legend>
                  <table>
                    <tr>
                      <td><input type="text" placeholder="제목을 입력해주세요." class="title" id="tCount" name = "title"></td>
                    </tr>
                    <tr>
                      <td><textarea id="text" cols="100" rows="15" placeholder="내용을 입력해주세요." class="text" name = "content"></textarea></td>
                    </tr>
                  </table>
                  <p class="countTitle"><span id="countTi"></span>/100</p>
                  <p class="countText"><span id="countT"></span>/2000</p>
                  <!-- <input type="submit" value="등록" class="sub"> -->
              
              
              
	                <div>
						<input type = "file" name = "uploadFile" multiple>
					</div>
					 
					<div class="btn btn-primary btn-icon-split">
						<input type="submit" value="등록" class="sub">
					</div>
            		 
              
              </form>
              <div id = "uploadResult">
				<ul></ul>
			  </div>
            </div>  
          </div><!--containerIn-->
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
        </div> <!--#container-->
</body>
</html>
<%@ include file="footer.jsp" %>