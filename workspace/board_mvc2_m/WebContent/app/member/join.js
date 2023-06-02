/**
 * 회원가입
 */
var checkId = false;

function check(id) {
	checkId = false;
	var form = document.joinForm;
	
	if(form.member_id.value == ""){
		alert("아이디를 확인해 주세요");
		return false;
	}else{
		/*var httpRequest = new XMLHttpRequest();
		httpRequest.open("POST", "MemberCheckId.me", true);
		httpRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
		console.log(id)
		httpRequest.send("member_id="+id);
		
		httpRequest.onreadystatechange = function(){
			if(httpRequest.readyState == XMLHttpRequest.DONE && httpRequest.status == 200){
				if(httpRequest.responseText.trim() == "ok"){
					checkId = true;
					document.getElementById("checkId").innerHTML = "사용할 수 있는 아이디입니다.";
					document.getElementById("checkId").style.color = "green";
					
				}else{
					document.getElementById("checkId").innerHTML = "중복된 아이디입니다.";
					document.getElementById("checkId").style.color = "red";
				}
			}
		}*/
		$.ajax({
			url: contextPath+"/member/MemberCheckId.me",
			type:"POST",
			data:"member_id="+id,
			dataType:"text",
			success:function(data){
				if(data.trim() == "ok"){
					checkId = true;
					$("#checkId").text("사용할 수 있는 아이디입니다.");
					$("#checkId").css("color","green");
					
				}else{
					
					$("#checkId").text("중복된 아이디입니다.");
					$("#checkId").css("color","red");
				}
			},
			error: function(){
				console.log("에러");
			}
		})
	}
}
//keydown으로 하면 너무 빠르다
$("input[name='member_id']").keyup(function(event){
	var id = $("input[name='member_id']").val();
	check(id);
})

function formSubmit() {
	var form= document.joinForm;
	if(form.member_id.value == ""){
		alert("아이디를 입력해 주세요");
		return false;
	}
	/*if($("#checkId").text ==""){
		alert("아이디를 중복체크 해주세요.");
		return false;
	}*/
	if(checkId == false){
		alert("중복된 아이디는 사용할 수 없습니다.");
		return false;
	}
	form.submit();
}
