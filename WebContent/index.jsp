<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String n = request.getParameter("n");
	String s = request.getParameter("s");	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int no = Integer.parseInt(n) ;
		for( int i = 0;i < no; i++){
	%>
		<h1>hellow world</h1>
	<%
		}
	%>
	<h4><%=n %></h4>
	<h4><%=s %></h4>
</body>
</html>   