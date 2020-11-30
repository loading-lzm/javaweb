<%--
  Created by IntelliJ IDEA.
  User: Crush
  Date: 2020/11/27
  Time: 0:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="userListServlet" method="get">
    <div class="result-content">
        <table class="result-tab" width="60%">
            <tr>
                <th>id</th>
                <th>姓名</th>
                <th>密码</th>
                <th>邮箱</th>
            </tr>
            <c:forEach var="users" items="${users}">
                <tr>
                    <td>${users.id}</td>
                    <td>${users.username}</td>
                    <td>${users.password}</td>
                    <td>${users.email}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</form>
</body>
</html>
