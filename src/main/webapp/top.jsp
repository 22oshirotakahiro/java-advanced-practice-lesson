<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>トップ画面</title>
</head>
<body>
	<h1>検索条件を入力してください</h1>
	
	<c:if test="${not empty requestScope.msg}">
		<c:out value="${requestScope.msg}" />
	</c:if>
	
	<form action="SearchServlet" method="post">
		<label>
			<span>製品ID：</span>
			<input type="text" name="product_id">
			<button type="submit">検索</button>
		</label>
	</form>
</body>
</html>