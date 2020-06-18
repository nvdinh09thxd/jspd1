package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//anotation
@WebServlet("/index")
/*
 * CONFIG web.xml lam quen với config Spring FrameWork
 * 
 */
public class IndexController extends HttpServlet {
	/*
	 * 1. Bản chất servlet là 1 file java 2. Kế thừa từ HttpServlet cho nên có thể
	 * chạy được với server Giao tiếp client - server (request - response)
	 */
	private static final long serialVersionUID = 1L;

	public IndexController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		out.print("Hello Java JSP Servlet!<br />");
		out.print("Xin chào JSP/SERVLET!<br />");
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().print(showName("NV Định"));
	}

	public String showName(String name) {
		return "Hello, " + name;
	}
}
