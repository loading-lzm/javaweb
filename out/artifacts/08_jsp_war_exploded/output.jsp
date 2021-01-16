<%--
  Created by IntelliJ IDEA.
  User: Crush
  Date: 2020/11/26
  Time: 0:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.write("out输出1 <br>");
    out.write("out输出2 <br>");

    response.getWriter().write("response输出1 <br>");
    response.getWriter().write("response输出2 <br>");

    //会先输出response  后输出out
    //原因是执行out.flash() 操作,会把out缓冲区中数据追加到response缓冲区末尾
    //执行 response 刷新操作 把全部数据写给客户端

    out.write("字符串1 <br>");
    out.print("字符串2 <br>");

    out.write(15);
    out.print(15);

    //print 可以输出 int型变量
    //write 只能输出 String型
%>
</body>
</html>
