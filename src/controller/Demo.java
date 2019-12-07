package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/trang-web-1")
public class Demo extends HttpServlet {
	//Servlet: là một file java, nhưng kế thừa từ lớp httpServlet nên có thể chạy được trên server
	protected void doGet(HttpServletRequest request, HttpServletResponse respone) throws IOException {
		PrintWriter out = respone.getWriter();
		out.println("Hi! Đây là trang web đầu tiên của tôi!");
	}
}
