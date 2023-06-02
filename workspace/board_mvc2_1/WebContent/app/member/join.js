/**
 * 회원가입
 */
var check = false;

function formSubmit(){
	var form = document.joinForm;
	if(form.member_id.value == '' || !check){
		alert("아이디를 확인해주세요.");
		form.member_id.focus();
		return false;
	}
	form.submit();
}

function checkId(id){
	check = false;
	if(id == ""){
		$("#idCheck_text").text("아이디를 작성해주세요.");
	}else{
		$.ajax({
			url: contextPath + "/member/MemberCheckIdOk.me?member_id="+id,
			type: 'get',
			dataType: 'text',
			success: function(data){
				if(data.trim() == "ok"){
					check = true;
					$("#idCheck_text").text("사용할 수 있는 아이디입니다.");
				}else{
					$("#idCheck_text").text("중복된 아이디입니다.");
				}
			},
			error: function(){
				console.log("오류");
			}
		})
	}
}
$("input[name='member_id']").keyup(function(event){
	var id = $("input[name='member_id']").val();
	checkId(id);
});










