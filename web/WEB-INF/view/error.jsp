<%--
  Created by IntelliJ IDEA.
  User: Fry
  Date: 6/12/2019
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Eror page</title>
</head>
<body>
<h3>Something goes wrong</h3>
<p>Type: <%= pageContext.getException().getClass().toString()%>
<p>Message:<%=pageContext.getException().getMessage()%>
<p><a href="${pageContext.request.contextPath}/">go to index</a>
</body>
</html>
