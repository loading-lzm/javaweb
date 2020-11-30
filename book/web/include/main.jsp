<%--
  Created by IntelliJ IDEA.
  User: Crush
  Date: 2020/11/26
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
头部信息<br>
主体内容<br>

<%--
    <%@ include file="%> 就是静态包含
    file 属性指定你要包含jsp页面的路径
    第一个 / 代表 工程路径

        1 静态包含不会翻译被包含的jsp页面
        2 静态包含是把被包含的jsp页面的代码拷贝到包含的位置执行输出

--%>
<%@include file="/include/footer.jsp" %>


<%--
    page 属性是指你要包含的jsp页面的路径
    动态包含也可以和静态包含一样,把被包含的内容执行到输出的包含位置

    动态包含的特点:
        1 动态包含会把包含的jsp也米娜翻译成java代码
        2 底层代码会被包含的jsp页面执行输出
        3 动态包含 可以传递参数
 -%>
<jsp:include page="/include/footer.jsp">
    <jsp:param name="username" value="bbj"/>
    <jsp:param name="password" value="root"/>
</jsp:include>

</body>
</html>
