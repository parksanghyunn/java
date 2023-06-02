<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Board</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" href="/resources/assets/css/main.css" />
	</head>
	<body class="is-preload">
		<!-- Main -->
			<div id="main">
				<div class="wrapper">
					<div class="inner">

						<!-- Elements -->
							<header class="major">
								<h1>Board</h1>
								<p>게시글 상세보기</p>
							</header>
									<!-- Table -->
										<h3><a href="/board/list${cri.getListLink()}" class="button small">목록 보기</a></h3>
						<div class="content">
							<div class="form">
								<form method="post" action="/board/remove">
									<input type="hidden" name="pageNum" value="${cri.pageNum}">
									<input type="hidden" name="amount" value="${cri.amount}">
									<input type="hidden" name="type" value="${cri.type}">
									<input type="hidden" name="keyword" value="${cri.keyword}">
									<div class="fields">
										<div class="field">
											<h4>번호</h4>
											<input name="bno" type="text" value="${board.bno}" readonly/>
										</div>
										<div class="field">
											<h4>제목</h4>
											<input name="title" type="text" value="${board.title}" readonly/>
										</div>
										<div class="field">
											<h4>내용</h4>
											<textarea name="content" rows="6" style="resize:none" readonly>${board.content}</textarea>
										</div>
										<div class="field">
											<h4>작성자</h4>
											<input name="writer" type="text" value="${board.writer}" readonly/>
										</div>
									</div>
									<ul class="actions special">
										<li>
											<input type="button" class="button" value="수정" onclick="location.href='/board/modify${cri.getListLink()}&bno=${board.bno}'"/>
											<input type="submit" class="button" value="삭제"/>
										</li>
									</ul>
									<ul class="icons">
			                       		<li style="display:block">
			                           		<span class="icon solid fa-envelope"></span>
			                          		 <strong>댓글</strong>
			                        	</li>
			                    	</ul>
			                     	<a href="#" style="width:100%" class="button primary small register">댓글 등록</a>
			                     	<div class="fields register-form" style="display:none">
			                        	<div class="field">
			                           		<h4>작성자</h4>
			                           		<input name="replyer" placeholder="Replyer" type="text" />
			                        	</div>
			                        <div class="field">
			                           <h4>댓글</h4>
			                           <textarea name="reply" rows="6" placeholder="Reply"
			                              style="resize: none"></textarea>
			                        </div>
			                        <div style="text-align:center" class="field regBtn">
			                           <a href="#" class="button primary small finish">등록</a>
			                           <a href="#" class="button primary small cancle">취소</a>
			                        </div>
			                     </div>
			                     <div>
				                     <ul class="replies">
				                     </ul>
			                     </div>
			                     <div class="big-width" style="text-align: center;">
			                     </div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div> 
		<!-- Scripts -->
			<script src="/resources/assets/js/jquery.min.js"></script>
			<script src="/resources/assets/js/jquery.dropotron.min.js"></script>
			<script src="/resources/assets/js/browser.min.js"></script>
			<script src="/resources/assets/js/breakpoints.min.js"></script>
			<script src="/resources/assets/js/util.js"></script>
			<script src="/resources/assets/js/main.js"></script>
			<script src="/resources/assets/js/reply.js"></script>
			
			<script>
				/* $(document).ready(function() {
					console.log(replyService.name);
				}); */
				
				$(".register").on("click",function(e){
					e.preventDefault();
					
					$(".register-form").show();
					$(this).hide();
				});
				
				$(".cancle").on("click",function(e){
					e.preventDefault();
					
					$(".register").show();
					$(".register-form").hide();
				});
				
				$(".finish").on('click',function(e){
					e.preventDefault();
					
					var bnoValue = "${board.bno}";
					var replyValue = $("textarea[name='reply']").val();
					var replyerValue = $("input[name='replyer']").val();
					
					replyService.add({bno:bnoValue,reply:replyValue,replyer:replyerValue},
						function(result){ alert(result+" 등록완료");location.reload();});
				});
			
				$(document).ready(function(){
					var bnoValue = "${board.bno}";
					var replyUL = $(".replies");
					
					var pageNum = "${replyPageNum}" || 1;
					var replyPageFooter = $(".big-width");
					
					
					showList(pageNum);
					
					$(window).resize(function(){
						showList(pageNum);
					});
					
					function showReplyPage(replyCnt) {
						var str = "";
						var endNum = Math.ceil(pageNum / 10.0) * 10;
						var startNum = endNum - 9;
						var realEnd =  Math.ceil(replyCnt / 10.0);
						
						var prev = startNum != 1;
						var next = false;
						
						if(endNum * 10 >= replyCnt){
							endNum = realEnd;
						}
						
						if(endNum * 10 < replyCnt){
							next = true;
						}
						
						//JS 미디어 쿼리
						//페이지 이동 시 a 태그의 class이름은 'changePage'로 설정한다
						//각 a태그의  href에는 이동할 페이지 번호만 작성해준다.
						if(matchMedia("screen and (max-width:918px)").matches){
							//918px보다 작거나 같은때
							//현재 페이지만 나타내고, 이전과 다음으로 -1, +1씩 이동하도록 구현
							console.log(pageNum);
							pageNum =  Number(pageNum);
					
							if(pageNum != 1){
								str +="<a href='"+(pageNum-1)+"' class='changePage'>&lt;</a>";
							}
								str +="<code>"+pageNum+"</code>";
							
							if(pageNum < realEnd){
								str += "<a href='"+(pageNum+1)+"' class='changePage'>&gt;</a>";
							}
						}else{
							//현재 페이지를 제외한 다른 페이지는 a태그로 클릭 가능
							//10개씩 페이지를 구성한다
							if(prev){
								str += "<a href='"+(startNum-1)+"' class='changePage'>&lt;</a>&nbsp;&nbsp;";
							}
							for (var num = startNum; num < endNum+1; num++) {
								if(pageNum == num){
									str += "<code>"+num+"</code>&nbsp;&nbsp;";
								}
								if(pageNum != num){
									str +="<a href='"+num+"' class='changePage'>"+num+"</a>&nbsp;&nbsp;";
								}
							}
							if(next){
								str += "<a href='"+(endNum+1)+"' class='changePage'>&gt;</a>";
							}
						}
						
						replyPageFooter.html(str);
						
						$(".changePage").on("click",function(e){
							e.preventDefault();
							pageNum =$(this).attr("href");
							console.log(pageNum);
							showList(pageNum);
						});
					}
					
					function showList(page) {
						replyService.getList({bno:bnoValue,page:page || 1},function(replyCnt, list){
							//댓글이 없으면 없다고 출력
							//있으면 그 민큼 반복해서 html()로 뿌리기
							var ulStr = ""
							if(replyCnt != 0){
								for (var i = 0; i < list.length; i++) {
									ulStr +="<li style='border-bottom:1px solid #ff8b77;'>"
									+"<a>"+list[i].replyer+"</a>"
									+"<p class='reply"+list[i].rno+"'>"+list[i].reply+"</p>"
									+"<div style='text-align:right'>"
									+"<strong>"+replyService.displayTime(list[i].replyDate)+"</strong>"
									+"<br><a href='"+list[i].rno+"' class='modify'>수정</a>"
									+"<a href='"+list[i].rno+"' class='finish' style='display:none;'>수정 완료</a>"
									+"&nbsp;&nbsp;<a href='"+list[i].rno+"' class='remove'>삭제</a></div>"
									+"</li>";
								}
								replyUL.html(ulStr);
								showReplyPage(replyCnt);
								
								$(".modify").on("click",function(e){
									e.preventDefault();
									
									var rnoValue = $(this).attr("href");
									var replyTag = $(".reply"+rnoValue);
									
									replyTag.html("<textarea class='"+rnoValue+"' style='resize:none;'>"+replyTag.text()+"</textarea>");
									$(this).hide();
									
									var finish = $(".finish");
									for (var i = 0; i < finish.length; i++) {
										if(finish[i].getAttribute("href") == rnoValue){
											finish[i].style.display="inline";
											break;
										}
									}
								});
								
								$(".finish").on("click", function(e){
									e.preventDefault();
									var rnoValue = $(this).attr("href");
									var reply = $("textarea."+rnoValue).val();
									console.log(reply);
									
									replyService.update({rno:rnoValue,bno:bnoValue,reply:reply},
											function(result){
												alert(result+" 댓글 수정 완료");
												//showList(pageNum);
												location.replace("/board/get${cri.getListLink()}&replyPageNum="+pageNum+"&bno="+bnoValue);
											});
								});
								
								$(".remove").on("click",function(e){
									e.preventDefault();
									var rnoValue = $(this).attr("href");
									
									replyService.remove(rnoValue,
											function(result){alert(result+" 댓글 삭제 완료");showList(pageNum);});
								});
							}else{
								replyUL.html("<li>등록된 댓글이 없습니다.</li>");
							}
						});
						
					}
				});
				//댓글 목록 테스트
			/* 	var bnoValue = "${board.bno}";
				
				replyService.getList({bno:bnoValue, page:1},function(total,list){
					console.log(total);
					console.log(list);
				}) */
				/* var bnoValue = "${board.bno}";
				replyService.u pdate({rno: "302", bno: bnoValue, reply:"수정쓰"}, function(result){alert(result+"MODIFY");}); */
			</script>
	</body>
</html>