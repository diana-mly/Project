<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
<% String email = request.getParameter("email");
if(email == null)
{
	out.print("You are not logged in");
}
else
{
	out.print("You are logged in as: " + email);
}
%>
</div>

<% if(email == null){ %>
	<a href="login.jsp"> Login </a>
	<br>
	<a href="register.jsp"> Register </a>
<% } 
	else { %>
	<form name="logoutForm" method="post" action="LogoutServlet">
    	<input type="submit" value="Logout" />
	</form>
<%
	}
%>

</body>
</html>