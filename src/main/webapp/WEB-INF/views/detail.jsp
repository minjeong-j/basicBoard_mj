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
		<input type="hidden" id="boardNum" value="${ boardVO.BOARD_NUM }"/>
			<table>	
				<tr class="center bold">
					<td>Title</td>
					<td>
						<input name="BOARD_TITLE" class="board_title" readonly="readonly" value='<c:out value="${boardVO.BOARD_TITLE}"/>'>
					</td>
				</tr>
				<tr>
					<td>Writer</td>
					<c:forEach items="${list}" var="list">
						<td>
							<input name="writer" readonly="readonly" value='<c:out value="${boardVO.CREATOR}"/>' >
						</td>
					</c:forEach>
				</tr>
				<tr>
					<td>Comment</td>
					<td>
						<textarea name="BOARD_COMMENT" readonly="readonly" class="board_comment"><c:out value="${boardVO.BOARD_COMMENT}"/></textarea>
					</td>
				</tr>
			</table>
			<div class="modify">
				<button type="button" id="updateBtn" onclick="location.href='${pageContext.request.contextPath}/update?boardNum=${boardVO.BOARD_NUM}'">수정</button>
				<button type="button" id="deleteBtn" onclick="deleteBoard()">삭제하기</button>
				<button type="button" id="ListBtn" onclick="location.href='${pageContext.request.contextPath}/list'">목록</button>
			</div>
		</form>
	</div>	
	
<script type="text/javascript">
	/*
	function addBoard(){
		f.action = "${pageContext.request.contextPath}/insert";
		f.submit();	
	}
	*/
	
	function deleteBoard(){
		f.action = "location.href='${pageContext.request.contextPath}/delete";
		f.submit();
	}
</script>
</body>
</html> 