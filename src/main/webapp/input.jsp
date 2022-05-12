<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<<<<<<< HEAD
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

=======
<%
    // 必要な処理を記述してください。

	if (request.getParameter("btn").equals("reset")) {
		session.removeAttribute("users");
	}

%>
>>>>>>> adv/lesson4
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<<<<<<< HEAD
<title>Java応用_演習問題5(発展)</title>
=======
<title>Java応用_演習問題1(発展)</title>
>>>>>>> adv/lesson4
<style>
body {
    border: solid 2px #000080;
    padding: 5px;
}

<<<<<<< HEAD
.result {
    background: #fffacd;
    display: inline-block;
    margin: 5px;
    padding: 10px;
}

.info {
  border: solid 2px #4682b4;
  border-radius: 20px;
  width: 260px;
  margin: 5px;
  padding: 10px;
}

.info label {
    display: inline-block;
    width: 80px;
    text-align: right;
}

.width-50 {
    width: 50px;
}


=======
.box {
    margin: 5px;
}

.box label {
    display: inline-block;
    width: 90px;
    text-align: right;
}
>>>>>>> adv/lesson4
</style>
</head>
<body>

<<<<<<< HEAD
  <h1>Java応用 - 演習問題5(発展)</h1>

  <c:if test="${not empty result}">
    <div class="result">
      <p>${result}</p>
    </div>
  </c:if>

  <h2>車の登録</h2>

  <div class="info">
    <form action="inputServlet" method="post">
      <label>名前：</label> <input type="text" name="carName"> <br>
      <label>車体の色：</label> <input type="text" name="bodyColor"> <br>
      <label>最高速度：</label> <input type="number" class="width-50" name="maxSpeed"> <br>
      <button type="submit">登録</button>
    </form>
  </div>
=======
  <h1>Java応用 - 演習問題1(発展)</h1>

  <h2>ユーザー登録</h2>

  <span>登録するユーザー(最大5件)の情報を入力してください</span>

  <form action="result.jsp" method="post">

    <div class="box">
      <label>ユーザID：</label> <input type="text" name="userId"> <br>
      <label>ユーザ名：</label> <input type="text" name="userName"> <br>
      <label>年齢：</label> <input type="number" min="0" max="120"
        name="age">
    </div>
    <button type="submit">登録</button>
  </form>

>>>>>>> adv/lesson4
</body>
</html>