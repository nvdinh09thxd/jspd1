package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/random")
public class RandomController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RandomController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		Random rd = new Random();
		int num1 = rd.nextInt(10);
		int num2 = rd.nextInt(20);
		int sum = num1 + num2;
		out.print("<h3 style='color: green; font-style: italic'>Số thứ nhất là: " + num1 + "</h3>");
		out.print("<h3 style='color: green; font-style: italic'>Số thứ hai là: " + num2 + "</h3>");
		out.print("<p style='color: blue; font-style: italic'>Tổng hai số là: " + sum + "</p>");
		if (sum % 2 == 0) {
			out.print("<p style='color: red; font-weight: bold'>Là số chẵn!</p>");
		} else {
			out.print("<p style='color: red; font-weight: bold'>Là số lẻ!</p>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
