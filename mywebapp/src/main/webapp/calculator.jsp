<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">

<blink>Result: <%=request.getParameter("n1") %> <%= request.getParameter("n2") %> <%=request.getAttribute("result") %></blink>


</body>
</html>