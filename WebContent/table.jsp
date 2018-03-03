<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   	String r = request.getParameter("r");
    String c = request.getParameter("c");
    
    int row = Integer.parseInt(r);
    int col = Integer.parseInt(c);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border ='1' cellpadding='10' cellspacing='0'>
		<%
			for(int i = 0; i < row ; i++){
		%>
		<tr>
			<%
				for(int j = 0;j < col;j++){
			%>
			<td>data(<%=j %>,<%=i %>)</td>
			<%
				}
			%>
		</tr>			
		<% 
			}
		%>
	</table>
</body>
</html>