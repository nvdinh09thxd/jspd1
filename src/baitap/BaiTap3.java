package baitap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaiTap3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BaiTap3() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		int tongBanGhi = 57;
		int soBanGhiCuaTrang = 10;
		float soTrang = (float) tongBanGhi / soBanGhiCuaTrang;
		out.print("<p>Số trang làm tròn tăng: " + (int) Math.ceil(soTrang) + "</p>");
		out.print("<p>Số trang làm tròn giảm: " + (int) Math.floor(soTrang) + "</p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
