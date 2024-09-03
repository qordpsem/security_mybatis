<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${id !=null}">
        ${id}님 로그인하였습니다.
            <a href="/logout">로그아웃</a>
    </c:if>
    <c:if test="${id == null}">
        <a href="/login">로그인</a>
    </c:if>
</body>
</html>
