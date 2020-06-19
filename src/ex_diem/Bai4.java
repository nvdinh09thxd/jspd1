package ex_diem;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index
 */
@WebServlet(name = "Index1", urlPatterns = { "/Index1" })
public class Bai4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Bai4() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		out.print(Check() + "<br>");
		if (Check() % 3 == 0) {
			out.print("chia het cho 3<br>");
		} else {
			out.print("không chia hết cho 3<br>");
		}
		if (Check() >= 15 && Check() <= 90) {
			out.print("số này nằm trong khoàng từ 15 đến 90<br>");
		} else {
			out.print("Số này không nằm trong khoảng từ 15 đến 90<br>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public int Check() {
		Random random = new Random();
		return (random.nextInt(110) + 10);
	}
}
