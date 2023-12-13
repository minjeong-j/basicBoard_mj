<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<form method="post" name="f" id="bForm" action="${path}/update?boardNum=${boardVO.BOARD_NUM}">	
		<input type="hidden" name="boardNum" value="${boardVO.BOARD_NUM}">	
			<table>
				<tr class="center bold">
					<td>Title</td>
					<td>
						<input name="BOARD_TITLE" class="board_title" value='<c:out value="${boardVO.BOARD_TITLE}"/>'>
					</td>
				</tr>
				<tr>
					<td>Writer</td>
					<c:forEach items="${list}" var="list">
						<input name="writer" readonly="readonly" value='<c:out value="${boardVO.CREATOR}"/>' >
					</c:forEach>
				</tr>
				<tr>
					<td>Comment</td>
					<td>
						<textarea name="BOARD_COMMENT" class="board_comment"><c:out value="${boardVO.BOARD_COMMENT}"/></textarea>
					</td>
				</tr>
			</table>
			<div class="modify">
				<div class="modify">
				<button type="button" id="submitBtn" onclick="editBoard()">완료</button>
				<button type="button" id="ListBtn" onclick="location.href='${pageContext.request.contextPath}/list'">목록</button>
			</div>
			</div>
		</form>
	</div>	
	
<script type="text/javascript">
	function editBoard(){
		f.action = "${pageContext.request.contextPath}/update";
		f.submit();
		
	}
</script>
</body>
</html> 