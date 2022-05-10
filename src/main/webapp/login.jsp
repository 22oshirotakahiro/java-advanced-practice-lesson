<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
	<h1>ログイン画面</h1>
	<div>
		<form action="LoginServlet" method="post">
			<c:if test="${requestScope.mistake} == true">
				<p>IDまたはPASSが間違っています</p>
			</c:if>
		    <label>ID：</label><input type="text" name="id">
		    <c:if test="${requestScope.idIsEmpty}" >
		    	<span>IDは必須です</span>
		    </c:if>
		    <br>
		    <label>PASS：</label><input type="text" name="pass">
   		    <c:if test="${requestScope.passIsEmpty}" >
		    	<span>PASSは必須です</span>
		    </c:if>
		    <br>
		    <button type="submit">ログイン</button>
		</form>
	</div>
</body>
</html>