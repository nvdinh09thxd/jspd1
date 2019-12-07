<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>DECLARATION</title>
   </head>
   <body>
      <h3>DECLARATION</h3>
      <!-- 
         Viết function tính chu vi và diện tích hình chữ nhật
          -->
      <%!
         float chieudai = 5;
         float chieurong = 2;
         //Phương thức tính chu vi
         public float chuviHCN(float chieudai, float chieurong){
         	return(chieudai+chieurong)*2;
         }
         //Phương thức tính diện tích
         public float dientichHCN(float chieudai, float chieurong){
         	return chieudai*chieurong;
         }
         %>
      <div>
         <h3>Thông tin hình chữ nhật</h3>
         <p>Chiều dài: <%=chieudai %></p>
         <p>Chiều rộng: <%=chieurong %></p>
         <p>Diện tích hình chữ nhật: <span style="color: red"><%=dientichHCN(chieudai, chieurong) %></span></p>
         <p>Chu vi hình chữ nhật: <span style="color: green"><%=chuviHCN(chieudai, chieurong) %></span></p>
      </div>
   </body>
</html>