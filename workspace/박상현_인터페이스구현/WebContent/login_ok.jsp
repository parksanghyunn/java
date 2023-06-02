<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<head>
<meta charset="UTF-8">
<title>로그인 완료</title>
</head>
<body class="is-preload">
<%
	String email = "";
	//email이라는 세션이 있으면 if에 들어가게된다.
	if(session.getAttribute("email")!=null){
		//email세션의 값은 string으로 다운캐스팅 한후 email이라는 객체에 담는다.
		email = (String)session.getAttribute("email");
	}
	//email에 어떠한 값이 담겨있을 경우 if로 들어가게 된다.
	if(!email.equals("")){
		
%>
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
			<li><a href="login_ok.jsp">Home</a></li>
			<li><a href="generic.html">Ipsum veroeros</a></li>
			<li><a href="generic.html">Tempus etiam</a></li>
			<li><a href="generic.html">Consequat dolor</a></li>
			<li><a href="elements.html">Elements</a></li>
		</ul>
		<ul class="actions stacked">
			<li><a href="logout.jsp" class="button fit primary">log out</a></li>
		</ul>
	</nav>

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Intro -->
		<section id="intro" class="wrapper featured style1">
			<div class="inner">
				<span class="image"><img src="images/pic01.jpg" alt="" /></span>
				<div class="content">
					<header>
						<h1>Reflex</h1>
						<p>
							<strong><%= email %></strong>님
							환영합니다!
						</p>
					</header>
					<footer>
						<ul class="actions">
							<li><a href="#" class="button big">Get Started</a></li>
						</ul>
					</footer>
				</div>
			</div>
		</section>
	</div>
			<!-- Footer -->
		<section id="footer" class="wrapper split style2">
			<div class="inner">
				<section>
					<header>
						<h3>Magna lorem ipsum</h3>
					</header>
					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Duis dapibus rutrum facilisis. Class aptent taciti sociosqu ad
						litora torquent per conubia nostra, per inceptos himenaeos magna
						fames ac turpis egestas amet non lorem amet.</p>
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
				<section>
					<form method="post" action="#">
						<div class="fields">
							<div class="field half">
								<input type="text" name="name" id="name" placeholder="Name" />
							</div>
							<div class="field half">
								<input type="email" name="email" id="email" placeholder="Email" />
							</div>
							<div class="field">
								<textarea name="message" id="message" placeholder="Message"
									rows="4"></textarea>
							</div>
						</div>
						<ul class="actions">
							<li><input type="submit" value="Send Message" /></li>
						</ul>
					</form>
				</section>
			</div>
			<div class="copyright">
				<p>&copy; Untitled. All rights reserved. Lorem ipsum dolor sit
					amet nullam.</p>
			</div>
		</section>

	</div>
<%}else{
		//session에 빈문자열이 담겨있을경우 처음 화면으로 넘어간다
		response.sendRedirect("index.html");
	}
%>
	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>
	<script src ="login_check.js"></script>
</body>
</html>