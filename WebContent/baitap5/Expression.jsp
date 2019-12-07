<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@page import="java.util.Random"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>EXPRESSION</title>
   </head>
   <body>
      <h2>Bài tập áp dụng JSP</h2>
	   <!-- 
	      Tạo ra số ngẫu nhiên trong khoảng từ 0 - 9 => sau đó in ra
	       -->
      <%
         Random rd = new Random();
         int sonn = rd.nextInt(10);
         %>
      <p>Số ngẫu nhiên: <span style="color: red"><%=sonn %></span></p>
   </body>
</html>