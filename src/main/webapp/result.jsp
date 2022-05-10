<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果画面</title>
</head>
<body>
	<h1>結果画面</h1>
	<c:if test="${requestScope.id} == &quotaxiz&quot ">
		<h1>ようこそ、axizさん</h1>
	</c:if>
	<c:if test="${requestScope.id} == &quottechnocore&quot">
		<h1>ようこそ、technocoreさん</h1>
	</c:if>
</body>
</html>