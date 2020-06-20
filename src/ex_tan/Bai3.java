package ex_tan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex3controller")
public class Bai3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Bai3() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		lamTron(response.getWriter());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void lamTron(PrintWriter out) {
		float tongBanGhi = 57;
		float soBanGhiCuaTrang = 10;
		double soTrang = tongBanGhi / soBanGhiCuaTrang;
		out.print("<p> Số trang chưa làm tròn:" + soTrang + "</p>");
		out.print("<p> Số trang làm trong tăng: " + Math.round(soTrang) + "</p>");
		out.print("<p> Số trang làm tròn giảm: " + Math.floor(soTrang) + "</p>");
	}
}