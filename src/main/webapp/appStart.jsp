<%@ page import="app.GameApp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java応用_演習問題1</title>
<style>
body {
  border: solid 2px #000080;
  padding: 5px;
}

.result {
  background: #fffacd;
  display: inline-block;
  margin: 5px;
  padding: 10px;
}
</style>
</head>
<body>

  <h1>ゲームアプリ実行ページ</h1>

  <div class="result">
    <h3>アプリの実行結果</h3>
    	<p>
    		<c:if test="${not empty result}">
    			<c:out value="${requestScope.result}" />
    		</c:if>
    		<c:if test="${empty result}">
    			<c:out value="アプリを実行できませんでした" />
    		</c:if>
    	</p>
  </div>

  <form action="StartAppServlet" method="post">
    <label>名前：</label>
    <input type="text" name="name">
    <br>
    <span>アプリ：
    <label><input type="radio" name="app" value="CardGameApp" checked>トランプ</label>
    <label><input type="radio" name="app" value="DartsGameApp">ダーツ</label>
    <label><input type="radio" name="app" value="ClockApp">時計</label>
    <label><input type="radio" name="app" value="others">その他</label>
    </span>
    <br>
    <button type="submit">実行</button>
  </form>
</body>
</html>