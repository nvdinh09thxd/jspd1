package ex_dung;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Bai4")
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
		PrintWriter out = response.getWriter();
		check(out);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
	}

	public void check(PrintWriter out) {
		Random rd = new Random();
		int number = rd.nextInt(100 - 10) + 1;
		out.print("Number = " + number + " <br />");
		if (number % 3 == 0) {
			out.print("Số này chia hết cho 3 <br />");
		} else {
			out.print("Số này không chia hết cho 3 <br />");
		}
		if (number >= 15 && number <= 90) {
			out.print("Số này nằm trong khoảng từ 15 đến 90 <br />");
		} else {
			out.print("Số này không nằm trong khoảng từ 15 đến 90 <br />");
		}
	}

}