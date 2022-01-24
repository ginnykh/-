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
                            </td>
                        </tr>
                        <tr class="con">
                            <td>
                                ${detail.content}
                            </td>
                        </tr>
                    </table>
                    <div class="btn">
                        <div class="btn_r"><a href="/filmlog/write">글쓰기</a></div>
                        <div class="btn_l"><a href="/filmlog/boardlist">목록보기</a></div>
                    </div>
                    <div class="beforeAfter">
                        <ul>
                            <li>
                                <a href="#">
                                    <span class="ba_l">이전글</span>
                                    <span class="ba_r">뭐시기 뭐시기 뭐시기</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="ba_l">다음글</span>
                                    <span class="ba_r">요시기 요시기 요시기</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div><!--containerIn-->
        </div> <!--#container-->
</body>
</html>
<%@ include file="footer.jsp" %>