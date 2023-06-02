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
 			 span{
 			 	color: white;
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
								<h3>게시글 작성</h3>
							<div class="spotlights">
								<div class="spotlight">
									<div class="content" style="width: 100%;">
										<div style="text-align: center;">
										<form id= "updateForm" action="/board/modify${cri.getListLink()}&bno=${bno}" method="post">
												<span>제목</span>
												<input type="text" name="title" value="${title}">
												<span>작성자</span>
												<input type="text" name="writer" value="${writer}">
												<span>내용</span>
												<input type="text" name="content" value="${content}">
										</form>
										</div>
										<a onclick="sendBoard()" class="button small fit" style="font-size: 20px">수정</a>
										<a href="/board/boardView${cri.getListLink()}&bno=${bno}"class="button primary small fit" style="font-size: 20px">돌아가기</a>
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
	var writeForm = $("#writeForm");
	function sendBoard() {
		if($("input[name='title']").val()==""){
			alert("제목을 입력해주세요");
			return false;
		}
		if($("input[name='writer']").val()==""){
			alert("작성자를 입력해주세요");
			return false;
		}
		if($("input[name='content']").val()==""){
			alert("내용을 입력해주세요");
			return false;
		}
		writeForm.submit();
	}	
	</script>
</html>