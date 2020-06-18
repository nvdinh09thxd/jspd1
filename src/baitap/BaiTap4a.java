package baitap;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaiTap4a extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BaiTap4a() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		Random rd = new Random();
		int number = rd.nextInt(90) + 10;
		if (number % 3 == 0)
			out.println("Số " + number + " Chia hết cho 3!");
		else
			out.println("Số " + number + " Không chia hết cho 3!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
