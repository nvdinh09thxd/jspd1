package baitap;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaiTap4b extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BaiTap4b() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		Random rd = new Random();
		int number = rd.nextInt(91) + 10;
		if (number >= 15 && number <= 90)
			out.println("Số " + number + " Nằm trong khoảng 15 đến 90!");
		else
			out.println("Số " + number + " Không nằm trong khoảng 15 đến 90!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
