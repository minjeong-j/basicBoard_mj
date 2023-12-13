<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>게시판</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/style.css">	
</head>
<body>
	<div class="cb">
		<form method="post" name="f" id="bForm">	
			<table>	
				<tr>
					<td>Type </td> 
					<td>
						<%-- 
						<select id="board_type" name="board_type" onchange="selectType()">
							<option value="1">일반</option>
							<option value="2">익명</option>
							<option value="3">Q&A</option>
							<option value="4" selected>자유</option>
						</select>
						--%>
						 <select id="board_type" name="BOARD_TYPE" class="board_type">
		                     <option value="1" <c:if test="${board_type == 1}">selected</c:if>>일반</option>
		                     <option value="2" <c:if test="${board_type == 2}">selected</c:if>>익명</option>
		                     <option value="3" <c:if test="${board_type == 3}">selected</c:if>>Q&A</option>
		                     <option value="4" <c:if test="${board_type == 4}">selected</c:if>>자유</option>
		                 </select>
					</td>
				</tr>
				<tr class="center bold">
					<td>Title</td>
					<td>
						<input type="text" name="BOARD_TITLE" class="board_title">
					</td>
				</tr>
				<tr>
					<td>Writer</td>
					<c:forEach items="${list}" var="list">
						<td>${list.CREATOR}</td>
					</c:forEach>
				</tr>
				<tr>
					<td>Comment</td>
					<td>
						<textarea name="BOARD_COMMENT" class="board_comment"></textarea>
					</td>
				</tr>
			</table>
			<div class="modify">
				<button type="button" id="modifyBtn" onclick="addBoard()">글쓰기</button>
				<button type="button" id="ListBtn" onclick="location.href='${pageContext.request.contextPath}/list'">목록</button>
			</div>
		</form>
	</div>	
	
<script type="text/javascript">
	function addBoard(){
		/* 
		if (f.board_title.value == "") {
			alert("제목을 입력해주세요");
			return;
		}
		if (f.board_comment.value == "") {
			alert("내용을 입력해주세요");
			return;
		}
		 */
		f.action = "${pageContext.request.contextPath}/insert";
		//f.action = "/insert";
		f.submit();
		
	}
</script>
</body>
</html> 