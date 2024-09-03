<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="/header.jsp"%>
<h2>회원가입</h2>
<hr>
<form action="/join" method="post">
    <!-- 토큰 받아오기 : 토큰 안 받을 수도 있지만 그러면 시큐리티 쓰는 의미가 없음 -->
    <input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }">

    아이디 : <input type="text" name="id"><br>
    비밀번호 : <input type="password" name="pwd"><br>
    이름 : <input type="text" name="name"><br>
    <input type="submit" value="가입">
    <input type="reset" value="다시입력">
</form>
</body>
</html>
