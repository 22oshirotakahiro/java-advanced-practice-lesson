<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索結果</title>
</head>
<body>
	<h1>検索結果</h1>
	
	<c:out value="${requestScope.msg}" />
	
	<div>製品ID：<span>${requestScope.product_id}</span></div>
	<div>製品名：<span>${requestScope.product_name}</span></div>
	<div>値段：<span>${requestScope.price}</span></div>
	
	<a href="top.jsp">戻る</a>
</body>
</html>