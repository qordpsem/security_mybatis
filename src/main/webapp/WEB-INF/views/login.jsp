<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>login</h2>
<hr>
<form action="/login" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    아이디 : <input type="text" name="username"><br>
    비밀번호 : <input type="text" name="password"><br>
    <input type="submit" value="로그인">
    <input type="reset" value="다시입력">
</form>
</body>
</html>
