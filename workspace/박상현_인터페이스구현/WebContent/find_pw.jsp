<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
</head>
<body class="is-preload">
	<!-- Header -->
	<header id="header">
		<nav>
			<ul>
				<li><a href="#menu">Menu</a></li>
			</ul>
		</nav>
	</header>
	<!-- Menu -->
	<nav id="menu">
		<h2>Menu</h2>
		<ul class="links">
			<li><a href="index.html">Home</a></li>
			<li><a href="generic.html">Ipsum veroeros</a></li>
			<li><a href="generic.html">Tempus etiam</a></li>
			<li><a href="generic.html">Consequat dolor</a></li>
			<li><a href="elements.html">Elements</a></li>
		</ul>
		<ul class="actions stacked">
			<li><a href="join.html" class="button fit primary">sign</a></li>
			<li><a href="login.html" class="button fit">Log In</a></li>
		</ul>
	</nav>
	<div id="wrapper">
		<!-- Intro -->
		<section id="find" class="wrapper featured style1">
			<h2 style="text-align: center; margin: 0 auto">비밀번호 찾기</h2>
			<form action="mail" method="get" name="findPw">
				<div class="row gtr-uniform">
					<div class="col-6 col-12-xsmall"
						style="margin-left: 37%; margin-top: 20px">
						<input type="email" name="email" id="email" value=""
							placeholder="Email" style="width: 50%" />
						<ul class="actions stacked">
							<li
								style="width: 30%; margin-left:10%; margin-top: 30px">
								<input onclick="find()" type="button" value="find">
							</li>
						</ul>
					</div>
				</div>
			</form>
		</section>
	</div>
	<!-- Footer -->
	<section id="footer" class="wrapper split style2">
		<div class="inner">
			<section>
				<header>
					<h3>Magna lorem ipsum</h3>
				</header>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis
					dapibus rutrum facilisis. Class aptent taciti sociosqu ad litora
					torquent per conubia nostra, per inceptos himenaeos magna fames ac
					turpis egestas amet non lorem amet.</p>
				<ul class="icons">
					<li><a href="#" class="icon brands fa-twitter"><span
							class="label">Twitter</span></a></li>
					<li><a href="#" class="icon brands fa-instagram"><span
							class="label">Instagram</span></a></li>
					<li><a href="#" class="icon brands fa-snapchat-ghost"><span
							class="label">Snapchat</span></a></li>
					<li><a href="#" class="icon brands fa-github"><span
							class="label">GitHub</span></a></li>
				</ul>
			</section>

		</div>
		<div class="copyright">
			<p>&copy; Untitled. All rights reserved. Lorem ipsum dolor sit
				amet nullam.</p>
		</div>
	</section>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>
	<script src="member.js"></script>
	<script src="//code.jquery.com/jquery-3.4.1.min.js"></script>
</body>
</html>