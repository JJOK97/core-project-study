<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- cpath : Context Path를 가져오는 방법 
	pageContext : servlet클래스를 상속해서 jsp 실행 시, 자동으로 제공하는 내장 객체
	contextpath : 특정 웹 어플리케이스 식별 하는 용도-->
<c:set var="cpath" value="${pageContext.request.contextpath}">
<html>
	<head>
		<title>Forty by HTML5 UP</title>
		<meta charset="UTF-8" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="resources/assets/css/main.css" />
	</head>
	<body>

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header" class="alt">
						<a href="index.html" class="logo"><strong>Forty</strong> <span>by HTML5 UP</span></a>
						<nav>
						
						<c:if test="${mvo == null}">
								<a href="#menu">로그인</a>
								</c:if>
							<!-- 로그인 후 Logout.jsp로 이동할 수 있는'로그아웃'링크와 '개인정보수정'링크를 출력하시오.
							세션안에 저장된 mvo값이 있을 경우.. -->
						<c:if test="${mvo != null}">
						<%cpath%>
							<a href="logout">로그아웃</a>
							<a href="update">회원정보 수정</a>
							<a href="delete?EMAIL=${mvo.EMAIL}">회원탈퇴</a>
							<c:if test="${mvo.getEMAIL().contains('admin')}">
								<a href="select">전체 회원 목록</a>
							</c:if>
						</c:if>
						</nav>
					</header>

				<!-- Menu -->
					<nav id="menu">	
						<ul class="links">
							<li><h5>로그인</h5></li>
								<form action="login" method="post">
									<li><input type="text" name="EMAIL" placeholder="Email을 입력하세요"></li>
									<li><input type="password" name="PW" placeholder="PW를 입력하세요"></li>
									<li><input type="submit" value="LogIn" class="button fit"></li>
								</form>
						</ul>
						<ul class="actions vertical">
							<li><h5>회원가입</h5></li>
								<form action="join" method="post" >
									<li><input id="inputEMAIL" type="text" name="EMAIL" placeholder="Email을 입력하세요"></li>
									<li><span id="EMAILCheckMsg"></span></li>
									<li><input type="password" name="PW" placeholder="PW를 입력하세요"></li>
									<li><input type="text" name="TEL" placeholder="전화번호를 입력하세요"></li>
									<li><input type="text" name="ADDRESS" placeholder="집주소를 입력하세요"></li>
									<li><input type="submit" value="JoinUs" class="button fit"></li>
								</form>
						</ul>
					</nav>			
				<!-- Banner -->
					<section id="banner" class="major">
						<div class="inner">
							<header class="major">
							<!-- EL표기법(표현식) : Expression Language
							JSP의 표현식을 대체해서 사용 -->
								<c:if test="${! empty mvo}">
								<!-- session안에 값이 있는 경우, email 출력 -->
								<h1>${mvo.EMAIL}님 환영합니다</h1>
								 </c:if>
								<c:if test="${empty mvo}">
										<h1>로그인 한 세션아이디를 출력해주세요</h1>
								 </c:if>

								<!-- 로그인 후 로그인 한 사용자의 세션아이디로 바꾸시오.
									 ex)smart님 환영합니다 -->
							</header>
							<div class="content">
								<p>아래는 지금까지 배운 웹 기술들입니다.<br></p>
								<ul class="actions">
									<li><a href="#one" class="button next scrolly">확인하기</a></li>
								</ul>
							</div>
						</div>
					</section>

				<!-- Main -->
					<div id="main">

						<!-- One -->
							<section id="one" class="tiles">
								<article>
									<span class="image">
										<img src="images/pic01.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">HTML</a></h3>
										<p>홈페이지를 만드는 기초 언어</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic02.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">CSS</a></h3>
										<p>HTML을 디자인해주는 언어</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic03.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">Servlet/JSP</a></h3>
										<p>Java를 기본으로 한 웹 프로그래밍 언어/스크립트 언어</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic04.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">JavaScript</a></h3>
										<p>HTML에 기본적인 로직을 정의할 수 있는 언어</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic05.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">MVC</a></h3>
										<p>웹 프로젝트 중 가장 많이 사용하는 디자인패턴</p>
									</header>
								</article>
								<article>
									<span class="image">
										<img src="images/pic06.jpg" alt="" />
									</span>
									<header class="major">
										<h3><a href="#" class="link">Web Project</a></h3>
										<p>여러분의 최종프로젝트에 웹 기술을 활용하세요!</p>
									</header>
								</article>
							</section>
					<!-- Two -->
							<section id="two">
								<div class="inner">
									<header class="major">
										<h2>나에게 온 메세지 확인하기</h2>
									</header>
									<p></p>
									<ul class="actions">
										<li>로그인을 하세요.</li>
										<li><a href="#" class="button next scrolly">전체삭제하기</a></li>
									</ul>
								</div>
							</section>

					</div>

				<!-- Contact -->
					<section id="contact">
						<div class="inner">
							<section>
								<form>
								<div class="field half first">
										<label for="name">Name</label>
										<input type="text"  id="name" placeholder="보내는 사람 이름" />
									</div>
									<div class="field half">
										<label for="email">Email</label>
										<input type="text"  id="email" placeholder="보낼 사람 이메일"/>
									</div>

									<div class="field">
										<label for="message">Message</label>
										<textarea  id="message" rows="6"></textarea>
									</div>
									<ul class="actions">
										<li><input type="submit" value="Send Message" class="special" /></li>
										<li><input type="reset" value="Clear" /></li>
									</ul>
								</form>
							</section>
							
							<section class="split">
								<section>
									<div class="contact-method">
										<span class="icon alt fa-envelope"></span>
										<h3>Email</h3>
										<a href="#">로그인 한 사람의 이메일:${mvo.EMAIL}</a>
										<!-- 로그인 한 사용자의 이메일을 출력하시오 -->
									</div>
								</section>
								<section>
									<div class="contact-method">
										<span class="icon alt fa-phone"></span>
										<h3>Phone</h3>
										<span>로그인 한 사람의 전화번호: ${mvo.TEL}</span>
										<!-- 로그인 한 사용자의 전화번호를 출력하시오 -->
									</div>
								</section>
								<section>
									<div class="contact-method">
										<span class="icon alt fa-home"></span>
										<h3>Address</h3>
										<span>로그인 한 사람의 집주소:${mvo.ADDRESS}</span>
										<!-- 로그인 한 사용자의 집주소를 출력하시오 -->
									</div>
								</section>
							</section>					
						</div>
					</section>

				<!-- Footer -->
					<footer id="footer">
						<div class="inner">
							<ul class="icons">
								<li><a href="#" class="icon alt fa-twitter"><span class="label">Twitter</span></a></li>
								<li><a href="#" class="icon alt fa-facebook"><span class="label">Facebook</span></a></li>
								<li><a href="#" class="icon alt fa-instagram"><span class="label">Instagram</span></a></li>
								<li><a href="#" class="icon alt fa-github"><span class="label">GitHub</span></a></li>
								<li><a href="#" class="icon alt fa-linkedin"><span class="label">LinkedIn</span></a></li>
							</ul>
							<ul class="copyright">
								<li>&copy; Untitled</li><li>Design: <a href="https://html5up.net">HTML5 UP</a></li>
							</ul>
						</div>
					</footer>

			</div>

		<!-- Scripts -->
		<script src="resources/assets/js/jquery.min.js"></script>
			<script src="resources/assets/js/jquery.scrolly.min.js"></script>
			<script src="resources/assets/js/jquery.scrollex.min.js"></script>
			<script src="resources/assets/js/skel.min.js"></script>
			<script src="resources/assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="resources/assets/js/main.js"></script>
			<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

	<script>
	// 사용자가 입력 후, 다른 곳을 클릭하면 코드 실행 'blur'
		$('#inputEMAIL').on('blur', function(){
			let EMAIL = $(this).val().trim();
			
			$.ajax({
				url: '${cpath}/EMAILCheck',
				type : 'GET',
				data : { //전송할 데이터
					EMAIL : EMAIL 	// key/value값 JSON 형태
					},
				dataType: 'json',
				success : function(data){
					console.log(data)
					if (data.available){	// 사용가능 (true)
						$("#EMAILCheckMsg").text("사용가능한 EMAIL입니다.");
					}else{			// 중복일 때
						$("#EMAILCheckMsg").text("중복된 EMAIL입니다.");
						
					}
				}
			
		})
		})
	</script>
	
	</body>
</html>



