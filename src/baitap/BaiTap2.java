package baitap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaiTap2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BaiTap2() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String tenHoa = "Hoa mẫu đơn";
		int giaBan = 120000;
		int soLuong = 4;
		int thanhTien = giaBan * soLuong;
		out.print("<p>Tên hoa: " + tenHoa + "</p>");
		out.print("<p>Giá bán: " + giaBan + " - Số lượng: " + soLuong + "</p>");
		out.print("<p>Thành tiền: " + thanhTien + "</p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
