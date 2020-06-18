package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/trang-web-1")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Servlet: là một file java, nhưng kế thừa từ lớp httpServlet nên có thể chạy
	// được trên server
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("Hi! Đây là trang web đầu tiên của tôi!");
	}
}
