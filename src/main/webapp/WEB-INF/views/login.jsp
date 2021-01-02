<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2021-01-02 002
  Time: 오후 1:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인 페이지</title>
</head>
<body>
<div>
    <h1>로그인</h1>
    <hr>
    <form action="login" method="post">
        <table border="1">
            <tr>
                <td>아이디</td>
                <td><input type="text" name="id" value="${userVo.id}"></td>
            </tr>
            <tr>
                <td>패스워드</td>
                <td><input type="password" name="password" value="${userVo.password}"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="로그인">
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
