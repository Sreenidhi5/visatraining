<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor=pink>

<blink>
<%
String[] selectedCars=(String[])session.getAttribute("selectedCars");
String[] selectedBooks=(String[])session.getAttribute("selectedBooks");
String[] selectedBikes=(String[])session.getAttribute("selectedBikes");

%>
<h4>Selected Books</h4>
<u1>
<%for(String aBook:selectedBooks)
{
	%>
	<li><%= aBook %></li>
	 <%
    }
    %>
	
</u1>
</ul>
<h4>Selected Cars</h4>
<ul>
    <%for(String aCar : selectedCars) 
    {
    %>
        <li><%= aCar %></li>
    <%
    }
    %>
</ul>

<h4>Selected Bikes</h4>
<ul>
    <%for(String aBike : selectedBikes) 
    {
    %>
        <li><%= aBike %></li>
    <%
    }
    %>
</ul>


</blink>

</body>
</html>