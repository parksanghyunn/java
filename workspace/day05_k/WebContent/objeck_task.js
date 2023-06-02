/**
 *자동차 주행에 필요한 js 
 */
var cnt = 0;
var check = false;
const stateCheck = document.getElementById("state");
const pwCheck = document.getElementById("pwCheck");
const start = document.getElementById("start");
const stop = document.getElementById("stop");
const carImg = document.getElementById("carImg");

function activeEnter() {
	//엔터는 고유keyCode값이 13이다
	//input태그에서 onkeyup속성을작성한다
	//<input onkeyup = "activeEnter()">
	//input태그에서 엔터 입력시 if문 안에 있는 문장이 실행
	if(window.event.keyCode == 13){
		//alert("엔터입력");
		//시동켜기
		SuperCar.engineStart();
	}
}

function SuperCar() {
	this.brand = "Ferrari";
	this.color = "Red";
	this.price = 15000;
}

SuperCar.prototype.pw = prompt("자동차 초기 비밀번호 입력");

//시동이 이미켜져있다면 이미 켜져있다는 메세지 출력
//시동이 꺼져있다면 input태그 보이게 하기
//시동켜기 버튼을 눌렀을 때 호출

SuperCar.showInput = function() {
	if(!check){
		pwCheck.style.visibility= "visible";
		//activeEnter();
	}else{
		//시동이 이미 켜져있을때
		//결과 태그.innerHTML = "이미 켜져있습니다"
		stateCheck.innerHTML = "시동이 이미 켜져있습니다.";
	}
}
SuperCar.engineStart = function() {
	//var stateCheck = document.getElementById("state");
	//비밀번호 비교, 경찰 출동 여부 판단
	//SuperCar.prototype.필드명
	var pw = document.getElementById("pwCheck").value;
	
	if(SuperCar.prototype.pw == pw){
		cnt = 0;
		stateCheck.innerHTML = "시동켜짐";
		check = true;
		carImg.src = "시동켜기.gif";
		pwCheck.style.visibility = "hidden";
	}else{
		cnt++;
		stateCheck.innerHTML = "비밀번호 틀림 : "+ cnt +"회";
		if(cnt == 3){
			alert("비밀번호를 3회 틀려 경찰이 출동합니다.");
			pwCheck.style.visibility = "hidden";
			carImg.src = "경찰.png";
			stateCheck.innerHTML = "경찰 출동";
			start.style.display="none";
			stop.style.display="none";
		}
	}
}
//시동끄기 버튼을 눌렀을 때 호출
SuperCar.engineStop = function() {
	//이미 시동이 꺼져있는지 판단
	if(check){
		check = false;
		stateCheck.innerHTML = "시동꺼짐";
		carImg.src = "시동끄기.gif"
	}else{
		stateCheck.innerHTML = "시동이 이미 꺼져있습니다.";
	}
}