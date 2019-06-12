<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>QR code</title>
</head>
<body>
Upper qr code
<p></p>
<img src="<c:url value='/codes/4558d2cb.png'/>">
<p></p>

<a href="${pageContext.request.contextPath}/">create new</a>
<%--<jsp:useBean id="fileName" class="java.lang.String" scope="request"/>--%>
<%--<h1>${text}</h1>--%>
</body>
</html>
