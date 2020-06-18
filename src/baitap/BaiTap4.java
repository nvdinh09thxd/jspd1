package baitap;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bai-tap-4")
public class BaiTap4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BaiTap4() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		Random rd = new Random();
		int number = rd.nextInt(91) + 10;
		out.println("<h3>So vua tao ra la: " + number + "</h3>");
		if (number % 3 == 0) {
			out.println("<p>So nay chia het cho 3</p>");
		} else {
			out.println("<p>So nay khong chia het cho 3</p>");
		}
		if (number >= 15 && number <= 90) {
			out.println("<p>So nay nam trong khoang 15 den 90</p>");
		} else {
			out.println("<p>So nay khong nam trong khoang 15 den 90</p>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
