package ex_dung;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Bai3")
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
		PrintWriter out = response.getWriter();
		bai3(out);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
	}

	public void bai3(PrintWriter out) {
		int tongBanGhi = 57;
		int soBanGhiCuaTrang = 10;
		double soTrang = (double) tongBanGhi / (double) soBanGhiCuaTrang;
		out.print("Số trang làm tròn tăng: " + Math.ceil(soTrang) + " <br />");
		out.print("Số trang làm tròn giảm: " + Math.floor(soTrang));
	}

}