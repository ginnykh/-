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
<link rel="stylesheet" href="/resources/css/filmlog/boardIndex.css">
<link rel="stylesheet" type="text/css" href="../resources/css/all.css">
<link rel="stylesheet" type="text/css" href="../resources/css/sb-admin-2.css">
<link href="../resources/css/bootstrap.css" rel="stylesheet">
<link href="../resources/css/metisMenu.css" rel="stylesheet">
<link href="../resources/css/font-awesome.css" rel="stylesheet" type="text/css">

<script type = "text/javascript" src = "https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type = "text/javascript" src = "../resources/js/FilmReplydetail.js"></script>
<script type = "text/javascript" src = "../resources/js/bootstrap.js"></script>
<script type = "text/javascript" src = "../resources/js/sb-admin-2.js"></script>
<script type = "text/javascript" src = "../resources/js/metisMenu.js"></script>
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
                <div class="contents">
                    <h3>자유게시판</h3>
                    <div class="btn_m"><a href="/filmlog/modify?bno=${detail.bno}">수정</a></div>
                    <!-- <div class="btn_m"><a href="/filmlog/remove?bno=${detail.bno}">삭제</a></div> -->
                    <table>
                        <tr>
                            <th>${detail.title}</th>
                        </tr>
                        <tr>
                            <td class="writer">
                                <span>${detail.writer}</span>
                                <span class="w_r">${detail.regdate}</span>
                                <span class="w_rr">${detail.cnt}</span>
                                <input type="hidden" value="${detail.bno}" id="bno">
                            </td> 
                        </tr>
                        <tr class="con">
                            <td>
                                ${detail.content}
                            </td>
                        </tr>
                    </table>
                    
                    <div id = "uploadResult" class="col-sm-12 mb-3 mb-sm-0">
						<ul></ul>
					</div>
					
                    <div class="btn">
                        <div class="btn_r"><a href="/filmlog/write">글쓰기</a></div>
                        <div class="btn_l"><a href="/filmlog/boardlist">목록보기</a></div>
                    </div>
                    <div class="beforeAfter">
                        <ul>
                            <li>
                                <a href="#">
                                    <span class="ba_l">이전글</span>
                                    <span class="ba_r">제목</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="ba_l">다음글</span>
                                    <span class="ba_r">입니뎅</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div><!--containerIn-->
            
            <div id = "uploadResult" class="col-sm-12 mb-3 mb-sm-0">
				<ul></ul>
			</div>
            
            
            
            
            <div class="panel-body">
			<!-- Button trigger modal -->
				<button id = "addReplyBtn" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
					댓글
				</button>
				
				<div>
					<ul id = "relist"></ul>
				</div>              
			</div>
            
            
            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h4 class="modal-title" id="myModalLabel">댓글</h4>
                                        </div>
                                        <div class="modal-body">
                                            <div>
                                            <label>Rno</label>
                                            <input type = "text" name = "rno">
                                            <input type = "hidden" name = "bno">
                                            </div>
                                            <div>
                                            <label>Replyer</label>
                                            <input type = "text" name = "replyer">
                                            </div>
                                            <div>
                                            <label>Reply</label>
                                            <input type = "text" name = "reply">
                                            </div>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" id = "modalRegisterBtn" class="btn btn-primary">댓글 쓰기</button>
                                            <button type="button" class="btn btn-primary" id = "modalModBtn">댓글 수정</button>
                                            <button type="button" class="btn btn-primary" id = "modalRemoveBtn">댓글 삭제</button>
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                        </div>
                                    </div>
                                    <!-- /.modal-content -->
                                </div>
                                <!-- /.modal-dialog -->
		</div>
            
            
            
            
            
            
        </div> <!--#container-->
</body>
</html>
<%@ include file="footer.jsp" %>