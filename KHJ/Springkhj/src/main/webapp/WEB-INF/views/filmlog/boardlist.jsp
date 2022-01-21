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
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="/resources/css/filmlog/boardList.css">   
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
               		<c:forEach items="${list}" var="board">
						<tr>
						    <td>${board.bno}</td>
						    <td><a href="/board/detail?bno=${board.bno}">${board.title}</a></td>
						    <td>${board.writer}</td>
						    <td>${board.regdate}</td>
						    <td>${board.cnt}</td>
						    <td>${board.good}</td>
						</tr>
                   </c:forEach>
               </tbody>
               </table>
               <form id = "actionForm" action = "/board/list" method = "get">
	           <div class = "form-control bg-light border-0 small">
	           			<input type = "text" value = "${pageMaker.cri.pageNum }" name = "pageNum">
	           			<input type = "text" value = "${pageMaker.cri.amount }" name = "amount">
		                   <select name = "search">
		                   		<option value = "T">제목</option>
		                   		<option value = "C">내용</option>
		                   		<option value = "W">작성자</option>
		                   		<option value = "TC">제목 + 내용</option>
		                   		<option value = "TCW">제목 + 내용 + 작성자</option>
		                   </select>
		                   <input type = "text" name = "keyword" value = "${pageMaker.cri.keyword }">
		                   <input type = "submit" value = "검색">
	           </div>
	           </form>
               <!-- <c:if test = "${login!=null}">
                <div class="write">
                    <a href="/filmlog/write">글쓰기</a>
                </div>
                </c:if> -->
              	

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