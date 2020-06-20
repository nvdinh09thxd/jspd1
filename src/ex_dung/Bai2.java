package ex_dung;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Bai2")
public class Bai2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Bai2() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		flower(out);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
	}

	public void flower(PrintWriter out) {
		String tenHoa = "Hoa mẫu đơn";
		int giaBan = 120000;
		int soLuong = 4;
		int thanhTien = giaBan * soLuong;
		out.print("Tên hoa: " + tenHoa + " <br />");
		out.print("Giá bán: " + giaBan + " VNĐ - Số lượng: " + soLuong + " <br />");
		out.print("Thành tiền: " + thanhTien + " VNĐ");
	}

}