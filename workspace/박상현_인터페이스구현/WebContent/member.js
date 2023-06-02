/**
 * 
 */
function check(email) {
	if (email == "") {
		alert("이메일을 입력해주세요");
		return false;
	}else{
		//이메일 형식을 확인하는 정규화식
		var regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

		if(!regExp.test(email)){
			alert("이메일 형식이 올바르지 않습니다.");
			return false;
			
		}else{
			var httpRequest = new XMLHttpRequest();
			httpRequest.open("GET", "check_email.jsp?email=" + email, true);
			//get방식으로 check_email에 email값을 보내준다
			httpRequest.send();
			
			httpRequest.onreadystatechange = function(){
				//성공 여부 확인
				if(httpRequest.readyState == XMLHttpRequest.DONE && httpRequest.status == 200){
					//check_text에서 db검사 후 ok가 출력되면 if안으로 들어간다
					if(httpRequest.responseText.trim() == "ok"){
						document.getElementById("check_text").innerHTML = "사용할 수 있는 이메일입니다.";
						document.getElementById("check_text").style.color = "green";
						//중복검사 성공시 회원가입 확인 버튼은 활성화한다
						$("#join_ok").attr("disabled",false);
						
					}else{
						document.getElementById("check_text").innerHTML = "중복된 이메일 입니다.";
						document.getElementById("check_text").style.color = "red";
						//이메일이 중복되면 회원가입 확인 버튼은 비활성화 한다
						$("#join_ok").attr("disabled",true);
					}
				}
			}
			
		}
	}
	
	
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
	}else{
		//8자리 이상, 대문자/소문자/숫자/특수문자 모두 포함되어 있는지 검사
		var reg = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/;
		var hangleCheck = /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
		
		if(!reg.test(frm.pw.value)){
			alert("비밀번호는 8자 이상이어야 하며, 대문자/소문자/숫자/특수문자 모두 포함해야 합니다.");
			return false;
		} 
		//비밀번호에 공백을 포함할 수 없다.
		else if(frm.pw.value.search(/\s/) != -1){
			alert("비밀번호는 공백 없이 입력해주세요.")
			return false;
		}
		//비밀번호에 한글을 포함할 수 없다.
		else if(hangleCheck.test(frm.pw.value)){
			alert("비밀번호에 한글을 사용할 수 없습니다.");
			return false;
		}
	}
	
	if(frm.name.value == ""){
		alert("이름을 입력해주세요.");
		return false;
	}
	
	if(frm.hobby.checked == false){
		alert("취미를 한개 이상 선택해 주세요");
		return false;
	}

	if(document.getElementById("demo-copy").checked == false){
		alert("약관에 동의해주세요");
		return false;
	}
	
	
	frm.submit();
}
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

//비밀번호 찾기버튼 클릭시 판단후 submit()한다.
function find() {
	var frm = document.findPw;
	if(frm.email.value == ""){
		alert("이메일을 입력하세요");
		return false;
	}else{
		//이메일 형식을 확인하는 정규화식
		var regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

		if(!regExp.test(frm.email.value)){
			alert("이메일 형식이 올바르지 않습니다.");
			return false;
		}
	}
	frm.submit();
}

//비밀번호 변경하기에서 사용(추후 구현 예정)
/*function chang() {
	var frm = document.changPw;
	
	if(frm.pw.value == ""){
		alert("비밀번호를 입력하세요");
		return false;
	}else{
		//8자리 이상, 대문자/소문자/숫자/특수문자 모두 포함되어 있는지 검사
		var reg = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/;
		var hangleCheck = /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
		
		if(!reg.test(frm.pw.value)){
			alert("비밀번호는 8자 이상이어야 하며, 대문자/소문자/숫자/특수문자 모두 포함해야 합니다.");
			return false;
		} 
		//비밀번호에 공백을 포함할 수 없다.
		else if(frm.pw.value.search(/\s/) != -1){
			alert("비밀번호는 공백 없이 입력해주세요.")
			return false;
		}
		//비밀번호에 한글을 포함할 수 없다.
		else if(hangleCheck.test(frm.pw.value)){
			alert("비밀번호에 한글을 사용할 수 없습니다.");
			return false;
		}
	}

	frm.submit();
}*/
