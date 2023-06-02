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
		</style>
	</head>
	<body class="is-preload">

		<!-- Header -->
			<header id="header" class="alt">
				<a class="logo" href="">안녕하세요</a>
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
								<div class="spotlight">
									<div class="content" style="width: 100%;">
										<div style="text-align: center;">
											<h3>제목</h3>
											<h1 style="text-align: center;">${title}</h1>
											<span style="float:left; ">작성자 : <a href="#" style="font-size: 20px">${writer}</a></span>
											<div style="float: right;">
												작성일 : <span>${regDate}</span><br>
												<c:choose>
															<c:when test="${regDate eq updateDate}">
																수정일 : <span class="updateDate" style="font-size:14px">수정기록이 없습니다.</span>
															</c:when>	
															<c:otherwise>
																수정일 : <span class="updateDate">${updateDate}</span>													
															</c:otherwise>										
															</c:choose>	
											</div>
										</div>
										<br>
										<textarea style="resize: none;font-size: 30px;text-align: center" readonly>${content}</textarea>
										<br>
										<div style="float: right;">
											<a class="button primary small" href="/board/modify${cri.getListLink()}&bno=${bno}">수정</a>
											<a class="button small" href="/board/remove${cri.getListLink()}&bno=${bno}">삭제</a>
										</div>
										<br>
										<a href="/board/boardList${cri.getListLink()}"class="button primary small fit" style="font-size: 20px">목록 보기</a>
									</div>
								</div>
							</div>
						</div>
					</section>
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
				
				$(".goGet").on("click", function(e){
					e.preventDefault();
					actionForm.append("<input type='hidden' name='bno' value='"+ $(this).attr("href") +"'>");
					actionForm.attr("action", "/board/get");
					actionForm.submit();
				})
				
			/* 	$("#searchForm a").on("click", function(e){
					e.preventDefault();
					searchCheck();
				})
			 */
				result = "${result}"
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