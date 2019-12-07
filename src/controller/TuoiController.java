package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TuoiController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TuoiController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String ten = "Trần Nguyễn Gia Huy";
		String ngaySinh = "12/03/1990";

		int namSinh = Integer.valueOf(ngaySinh.split("\\/")[ngaySinh.split("\\/").length - 1]);

		int yearNow = LocalDateTime.now().getYear();
		int tuoi = yearNow - namSinh;
		out.print("Nam sinh: " + namSinh + "<br>");
		out.print("Nam hiện tại: " + yearNow + "<br>");
		out.println("<h1>Tên: " + ten + "</h1>");
		out.println("<h2>Tuổi: " + tuoi + "</h2>");

		// ưu nhược điểm của jsp/servlet

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
