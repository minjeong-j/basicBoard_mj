<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>게시판</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/style.css">
</head>
<body>
	<div class="container">
		<div class="fl">
			<div class="login">
				login 
			</div>
			<div class="join">
				join
			</div>
		</div>
		<div id="totalChk" class="fr">
			<button>total</button>
		</div>
			
		<div class="cb">
			<div class="t">
				<table>
					<tr class="center bold">
						<td>Type</td>
						<td>No</td>
						<td>Title</td>
					</tr>
					<c:forEach items="${list}" var="list">
						<tr>
							<td class="center">${list.BOARD_TYPE}</td>
							<td class="center">${list.BOARD_NUM}</td>
							<td>
								<a href="${pageContext.request.contextPath}/detail?boardNum=${list.BOARD_NUM}">
									${list.BOARD_TITLE}
								</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<div class="modify">
			<button type="button" id="modifyBtn" onclick="location.href='${pageContext.request.contextPath}/write'">글쓰기</button>
		</div>
		<div class="search">
			<input type="checkbox" name=boardType class="checkboxA">전체 
			<input type="checkbox" name=boardType class="checkboxB">일반
			<input type="checkbox" name=boardType class="checkboxC">QnA
			<input type="checkbox" name=boardType class="checkboxD">익명
			<input type="checkbox" name=boardType class="checkboxE">자유
			<button>조회</button>
		</div>
		
		<div class="paging">
		1 2 3
		</div>
	</div>
</body>
<script type="text/javascript">
	$("#totalChk").click(function(){
		$.ajax({
			url: "totalChecker",
			type: "post",
			dataType: "json",
			data: {
				"param" : 1
			},
			success : function (data) {
				alert("성공");
			},
			error: function (err) {
				console.log(err);
				alert('실패');
			}
		})
	})
	
</script>
</html>