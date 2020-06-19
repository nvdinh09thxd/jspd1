package ex_diem;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Bai3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Bai3() {
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
		OutputData(out);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public void OutputData(PrintWriter out) {
		int tongBanGhi = 57;
		int banGhiCuaTrang = 10;
		float soTrang = (float) tongBanGhi / banGhiCuaTrang;
		out.print(" Số trang làm tròn tăng: " + (int) Math.ceil(soTrang) + "<br>");
		out.print("Số trang làm tròn giảm: " + (int) Math.floor(soTrang));
	}
}
