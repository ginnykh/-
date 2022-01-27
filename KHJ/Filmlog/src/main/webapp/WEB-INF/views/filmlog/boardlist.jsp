<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ include file="header.jsp" %>

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
<link rel="stylesheet" href="/resources/css/filmlog/boardList.css">   
<script type = "text/javascript" src = "https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type = "text/javascript" src = "../resources/js/filmlogList.js"></script>
</head>
<body>
<div id="container">
            <section class="slide">
                <div class="slide-img">
                    슬라이드
                    <!-- <img src="./img/slide.PNG" alt=""> -->
                </div>
            </section>

            <section class="board">
                <h2>자유게시판</h2>
                <table>
                    <tr>
                        <th>번호</th>
                        <th>제목</th>
                        <th>작성자</th>
                        <th>작성일</th>
                        <th>조회수</th>
                        <th>좋아요</th>
                    </tr>

                    <tbody>
               		<c:forEach items="${boardlist}" var="filmlog_board">
						<tr>
						    <td>${filmlog_board.bno}</td>
						    <td><a href="/filmlog/detail?bno=${filmlog_board.bno}">${filmlog_board.title}</a></td>
						    <td>${filmlog_board.writer}</td>
						    <td>${filmlog_board.regdate}</td>
						    <td>${filmlog_board.cnt}</td>
						    <td>${filmlog_board.good}</td>
						</tr>
                   </c:forEach>
               </tbody>
               </table>
               <form id = "actionForm" action = "/filmlog/boardlist" method = "get">
	           <div class = "board">
	           			<input type = "text" value = "${pageMaker.fcri.pageNum }" name = "pageNum">
	           			<input type = "text" value = "${pageMaker.fcri.amount }" name = "amount">
		                   <select name = "search">
		                   		<option value = "T">제목</option>
		                   		<option value = "C">내용</option>
		                   		<option value = "W">작성자</option>
		                   		<option value = "TC">제목 + 내용</option>
		                   		<option value = "TCW">제목 + 내용 + 작성자</option>
		                   </select>
		                   <input type = "text" name = "keyword" value = "${pageMaker.fcri.keyword }">
		                   <input type = "submit" value = "검색">
	           </div>
	           </form>
            

                <div class="search">
                    <label><input type="radio" name="board" checked>제목</label>
                    <label><input type="radio" name="board">내용</label>
                    <input type="text" class="s-text">
                    <button>검색</button>
                </div>
            </section>
            
            
            
            <section class = "page">
	            <div class = ""> <!--  클래스 이름 -->
	           	<ul class = "pagination">
	           	<c:if test = "${pageMaker.prev}">
	           	<li class = "paginate_button page-item previous" id = "dataTable_previous">
	           		<a class = "page-link" href = "${pageMaker.startPage-1}">이전</a>
	           	</li>
	           	</c:if>
		           	<c:forEach var = "num" begin = "${pageMaker.startPage}" end = "${pageMaker.endPage}">
		           		
		           			<li class ="paginate_button page-item">
		           			<a href = "${num}" class = "page-link">${num}</a>
		           			</li>
	           		
	           		</c:forEach>
	           		<c:if test = "${pageMaker.next}">
	           		<li class = "paginate_button page-item next" id = "dataTable_next">
	           		<a class = "page-link" href = "${pageMaker.endPage+1}">다음</a>
	           		</li>
	           		</c:if>
	           	</ul>
	           </div>
           </section>
            
            
            
            
            
            
            
        </div> <!--#container-->
</body>
</html>
<%@ include file="footer.jsp" %>