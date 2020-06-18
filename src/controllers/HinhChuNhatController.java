package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/HinhChuNhatController")
public class HinhChuNhatController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HinhChuNhatController() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// request: client: yeu cau vao trang web 1
		// response: phản hồi

		// Tạo 2 số ngẫu nhiên, tính diện tích của hình chữ nhật
		res.setContentType("text/html");
		res.setCharacterEncoding("utf-8");

		PrintWriter out = res.getWriter();
		Random rd = new Random();
		int chieuDai = rd.nextInt(20);
		int chieuRong = rd.nextInt(20);
		int dt = chieuDai * chieuRong;
		// Số chi�?u dài có màu đ�?, chi�?u rộng có màu xanh, diện tích có màu tím đậm
		out.print("<h2>Tính diện tích hình chữ nhật!</h2>");
		out.print("<p style='color: red'>Chieu dai: " + chieuDai + "</p>");
		out.print("<p style='color: blue'>Chieu rong: " + chieuRong + "</p>");
		out.print("<p style='color: #ED39E8; font-weight: bold'>Dien tich: " + dt + "</p>");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

}
