<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체 예제</title>
</head>
<body>
	<form action="object_ok.jsp" name= "join" method="post">
		<fieldset>
			<legend>개인 정보</legend>
			<input type = "text" name = "name">
			<input type = "date" name = "birthday">
			<input type = "button" value = "확인" onclick="sendit()">
		</fieldset>
	</form>
</body>
<script src = "//code.jquery.com//jquery-3.5.1.min.js"></script>
<script>
	function sendit() {
		var frm = document.join;
		const name  = $('input[name = name]');
		const birthday = $('input[name = birthday]');
		//이름을 입력하지 않았을때
		//return false를 작성하면 바로 함수가 종료하기 때문에
		//위에서부터 순차적으러 검사하도록 구현 할때 return false를 사용한다
		
		//이름 input 태그 테두리를 빨간색으로 변경
		//input태그 안에 성함을 입력하세요 문구 추가
		//console.log(name.val());
		if(frm.name.value == ""){
			name.css("border-color","red");
			name.attr("placeholder","성함을 입력하세요");
			return false;
		}
		//생년월일 입력하지 않았을때
		//생연월일 input태그 테두리를 빨간색으로 변경
		if(frm.birthday.value == ""){
			birthday.css("border-color","red");
			return false;
		}
		
		frm.submit();
		//테두리가 생긴 영역을 클릭하면 원래대로 원상복구
		name.click(function() {
			name.removeAttr("style");
			name.removeAttr("placeholder");
		})
		birthday.click(function() {
			birthday.removeAttr("style");
		})
	}
</script>
</html>