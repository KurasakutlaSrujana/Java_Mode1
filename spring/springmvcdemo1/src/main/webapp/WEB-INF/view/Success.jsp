
<%@page import="com.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%
  Employee val = (Employee)request.getAttribute("key");
  out.print(val.getEmpId());
  out.print(val.getEmpName());
    
%> --%>

<br>
${key.empId}
<br>
${key.empName}

</body>
</html>