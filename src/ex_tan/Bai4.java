package ex_tan;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex4Controller")
public class Bai4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Bai4() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		numberRandom(response.getWriter());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void numberRandom(PrintWriter out) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int number = rd.nextInt(91) + 10;
		out.print("<p style='color:red;'> Số ngẫu nhiên là: " + number + "</p>");
		if (number % 3 == 0) {
			out.print("<p> Số " + number + " Là số chia hết cho 3 </p>");
		} else {
			out.print("<p> Số " + number + " Là số không chia hết cho 3 </p>");
		}
		if (number >= 15 && number <= 90) {
			out.print("<p> Số " + number + "là số nằm trong khoảng từ 15 đến 90");
		} else {
			out.print("<p> Số " + number + "là số không nằm trong khoảng từ 15 đến 90");
		}
	}
}