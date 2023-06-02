<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Untitled</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" href="/resources/assets/css/main.css" />
		<style>
			 a:link {text-decoration: none;}
			 a:visited {text-decoration: none;}
 			 a:hover {text-decoration: underline;}

			.paging-small{
				display: none;
			}
			select{
				display:inline;
				width:15%;
			}
			
			#keyword{
				display:inline;
				width:60%;
			}
			#searchBtn{display: none;}
			@media(max-width:918px){
				.paging-small{display: block;}	
				.paging-big{display: none;}	
				.writer{display: none;}
				.regDate{display: none;}
				.updateDate{display: none;}
				select{ width: 100%;}
				#keyword{ width:100%;}
				#searchBtn{display: block;}
			}
		</style>
	</head>
	<body class="is-preload">

		<!-- Header -->
			<header id="header" class="alt">
				<a class="logo" href="/board/boardList">안녕하세요</a>
			</header>

		<!-- Banner -->
			<div id="banner">
				<img src="/resources/images/pic04.jpg" style="width: 100%; height:100px;margin: 0 auto">
			</div>

		<!-- Wrapper -->
			<div id="wrapper">
					<section id="one" class="wrapper style1" style="text-align: center;">
						<div class="inner">
							<div class="spotlights">
								<div style="float: right;">
									<a class="button small" href="/board/boardWrite${pageMaker.cri.getListLink()}">등록</a>
								</div>	
								<h2>게시글</h2>
								<div class="spotlight">
									<div class="content" style="width: 100%;">
										<div class="contents">
											<table>
												<thead>
													<tr>
														<th style="text-align: center" class="bno">번호</th>
														<th style="text-align: center" class="title">제목</th>
														<th style="text-align: center" class="writer">작성자</th>
														<th style="text-align: center" class="regDate">작성일</th>
														<th style="text-align: center" class="updateDate">수정일</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach items="${list}" var="board">
														<tr>
															<td class="bno">${board.bno}</td>													
															<td class="title"><a href="/board/boardView${pageMaker.cri.getListLink()}&bno=${board.bno}">${board.title}</a></td>													
															<td class="writer">${board.writer}</td>													
															<td class="regDate">${board.regDate}</td>
															<c:choose>
															<c:when test="${board.regDate eq board.updateDate}">
																<td class="updateDate">수정기록이 없습니다.</td>
															</c:when>	
															<c:otherwise>
																<td class="updateDate">${board.updateDate}</td>													
															</c:otherwise>										
															</c:choose>		
														</tr>
													</c:forEach>
												</tbody>
											</table>
										</div>
										<form action="/board/boardList" method="get" id="searchForm">
											<div class="fields">
												<div class="field">
													<div style="text-align:center">
														<select name="type">
															<option value="" ${pageMaker.cri.type == null ? 'selected' : ''}>검색 기준</option>
															<option value="T" ${pageMaker.cri.type == 'T' ? 'selected' : ''}>제목</option>
															<option value="C" ${pageMaker.cri.type == 'C' ? 'selected' : ''}>내용</option>
															<option value="W" ${pageMaker.cri.type == 'W' ? 'selected' : ''}>작성자</option>
															<option value="TC" ${pageMaker.cri.type == 'TC' ? 'selected' : ''}>제목 또는 내용</option>
															<option value="TW" ${pageMaker.cri.type == 'TW' ? 'selected' : ''}>제목 또는 작성자</option>
															<option value="TCW" ${pageMaker.cri.type == 'TCW' ? 'selected' : ''}>전체 검색</option>
														</select>
														<input id="keyword" name="keyword" type="text" value="${pageMaker.cri.keyword}">
														<input name="pageNum" type="hidden" value="${pageMaker.cri.pageNum}">
														<input name="amount" type="hidden" value="${pageMaker.cri.amount}">
														<a href="#" class="button primary" id="searchBtn">검색</a>
													</div>
												</div>
											</div>
										</form>
										<div class="paging-big" style="text-align: center">
											<c:if test="${pageMaker.prev}">
												<a class="changePage" href="${pageMaker.startPage - 1}"><code>&lt;</code></a>
											</c:if>
											<c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
												<c:choose>
													<c:when test="${num eq pageMaker.cri.pageNum}">
														<code>${num}</code>
													</c:when>
												<c:otherwise>
													<a class="changePage" href="${num}"><code>${num}</code></a>
												</c:otherwise>
												</c:choose>
											</c:forEach>
											<c:if test="${pageMaker.next}">
												<a class="changePage" href="${pageMaker.endPage + 1}"><code>&gt;</code></a>
											</c:if>
										</div>
										<div class="paging-small" style="text-align:center">
											<c:if test="${pageMaker.cri.pageNum > 1}">
												<a class="changePage" href="${pageMaker.cri.pageNum - 1}"><code>&lt;</code></a>
											</c:if>
											<code>${pageMaker.cri.pageNum}</code>
											<c:if test="${pageMaker.cri.pageNum != pageMaker.realEnd}">
												<a class="changePage" href="${pageMaker.cri.pageNum + 1}"><code>&gt;</code></a>
											</c:if>
										</div>
									</div>
								</div>
							</div>
						</div>
					</section>
					<form id="actionForm" action="/board/boardList" method="get">
						<input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum}">
						<input type="hidden" name="amount" value="${pageMaker.cri.amount}">
					</form>
			</div>

		<!-- Footer -->
			<div id="footer" class="wrapper">
				<div class="inner">
					<header>
						<h2>Get in touch</h2>
						<p>Ut convallis, sem sit amet interdum consectetuer, odio augue aliquam leo, nec dapibus tortor nibh sed augue. Integer eu magna sit amet metus ferment. Pellentesque a diam sit amet amet dolor ullamcorper vehicula. Lorem ipsum dolor sit amet dolor sit amet consequat.</p>
					</header>
				</div>
			</div>

		<!-- Scripts -->
			<script src="/resources/assets/js/jquery.min.js"></script>
			<script src="/resources/assets/js/jquery.dropotron.min.js"></script>
			<script src="/resources/assets/js/jquery.scrollex.min.js"></script>
			<script src="/resources/assets/js/jquery.scrolly.min.js"></script>
			<script src="/resources/assets/js/browser.min.js"></script>
			<script src="/resources/assets/js/breakpoints.min.js"></script>
			<script src="/resources/assets/js/util.js"></script>
			<script src="/resources/assets/js/main.js"></script>

	</body>
				<script>
				result = "${result}";
				bno = "${bno}";
				$(document).ready(function() {
					if(result == "deleteOk"){
						alert(bno+"번 게시글을 삭제하였습니다.");
					}
					if(result =="updateOk"){
						alert(bno+"번 게시글을 수정하였습니다.");
					}
				});
				var actionForm = $("#actionForm");
				var searchForm = $("#searchForm");
			
				function searchCheck(){
					if(!searchForm.find("option:selected").val()){
						alert("검색 종류를 선택하세요");
						return false;
					}
					if(!searchForm.find("input[name='keyword']").val()){
						alert("키워드를 입력하세요");
						return false;
					}
					
					searchForm.find("input[name='pageNum']").val("1");
					searchForm.submit();
				}
			
				$("#keyword").keydown(function(key){
					if(key.keyCode == 13){
						searchCheck();
					}
				})
			
				$(".changePage").on("click", function(e){
					e.preventDefault();
					actionForm.find("input[name='pageNum']").val($(this).attr("href"));
					actionForm.submit();
				});
				
			 	$("#searchForm a").on("click", function(e){
					e.preventDefault();
					searchCheck();
				})
			 
				$(document).ready(function(){
					if(result == '' || history.state){
						return;
					}
					
					if(parseInt(result) > 0){
						alert("게시글 " + parseInt(result) + "번이 등록되었습니다.");
					}
					
					history.replaceState({}, null, null);
				})
				
			</script>
</html>