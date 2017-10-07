<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date,java.util.Calendar" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="error.jsp" %>

<%="The customer id generated id"%>
<%=session.getAttribute("seqid") %>

<%-- <%=new Date() %> --%>
<%-- <%=Calendar.getInstance() %> --%>
<%-- <%=10/0 %> --%>
<form action="paybill.obj">
<input type="submit" value="PayBill"/>
</form>
</body>
</html>