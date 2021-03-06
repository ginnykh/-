<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../resources/css/all.css">
	<link rel="stylesheet" type="text/css" href="../resources/css/sb-admin-2.css">
	<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">
    <script type = "text/javascript" src = "https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script type = "text/javascript" src = "../resources/js/list.js"></script>
</head>
<body>
<h1>게시판 목록 리스트</h1>
	<div class="card-body">
       <div class="table-responsive">
           <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
               <thead>
                   <tr>
                       <th>게시판번호</th>
                       <th>제목</th>
                       <th>작성자</th>
                       <th>작성일</th>
                       <th>조회수</th>
                   </tr>
               </thead>
               <tbody>
               		<c:forEach items="${list}" var="newBoard">
						<tr>
						    <td>${newBoard.bno}</td>
						    <td><a href="/board/detail?bno=${newBoard.bno}">${newBoard.title}</a></td>
						    <td>${newBoard.writer}</td>
						    <td>${newBoard.regdate}</td>
						    <td>${newBoard.cnt}</td>
						</tr>
                   </c:forEach>
               </tbody>
           </table>
           <form id = "actionForm" action = "/newBoard/list" method = "get">
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
           </div>
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
       </div>
</body>
</html>