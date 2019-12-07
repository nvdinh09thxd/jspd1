<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>SCRIPTLET</title>
   </head>
   <body>
      <h1>SCRIPTLET</h1>
      <!-- 
         Cho 2 số, sau đó tính tổng => in ra 2 số, và tổng
         -->
      <%
         int number1 = 10;
         int number2 = 20;
         int sum = number1 + number2;
         %>
      <p>
         Số thứ nhất:
         <%
            out.println(number1);
            %>
      </p>
      <p>
         Số thứ hai:
         <%
            out.println(number2);
            %>
      </p>
      <p style="color: red; font-weight: bold">
         Tổng:
         <%
            out.println(sum);
            %>
      </p>
   </body>
</html>