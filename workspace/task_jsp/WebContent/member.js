/**
 * 
 */

function login() {
	var frm = document.loginForm;
	if(frm.email.value == ""){
		alert("이메일을 입력하세요");
		return false;
	}
	if(frm.pw.value == ""){
		alert("비밀번호를 입력하세요");
		return false;
	}
	frm.submit();
}

function join() {
	var frm = document.joinForm;
	if(frm.email.value == ""){
		alert("이메일을 입력하세요");
		return false;
	}
	if(frm.pw.value == ""){
		alert("비밀번호를 입력하세요");
		return false;
	}
	
	
	frm.submit();
}
function check(email) {
	//console.log(email);
	
	if(email == ""){
		alert("이메일을 입력해주세요.");
		return false;
	}
	
	var httpRequest = new XMLHttpRequest();
	httpRequest.open("get", "check_email.jsp?email="+email, true);
	//httpRequest.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	httpRequest.send();
	
	httpRequest.onreadystatechange = function(){
		if(httpRequest.readyState == XMLHttpRequest.DONE && httpRequest.status == 200){
			if(httpRequest.responseText.trim() == "ok"){
				document.getElementById("check_text").innerHTML = "사용할 수 있는 이메일 입니다.";
			}else{
				document.getElementById("check_text").innerHTML = "중복된 이메일 입니다.";
			}
		}
	}
	
	
}