package ex_diem;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/IndexController")
public class Bai2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Bai2() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
		String tenHoa = "Hoa mẫu đơn";
		int giaBan = 120000;
		int soLuong = 4;
		int thanhTien = giaBan * soLuong;
		out.print("Tên Hoa:" + tenHoa + "<br>");
		out.print("Giá bán:" + giaBan + "- Số lượng:" + soLuong + "<br>");
		out.print("Thành tiền:" + thanhTien + "<br>");
	}
}
