package ex_tan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex2Controller")
public class Bai2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Bai2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		bien(response.getWriter());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
public void bien(PrintWriter out) {
	String tenHoa="Hoa Mẫu Đơn";
	int giaBan=12000;
	int soLuong=4;
	float thanhTien=giaBan*soLuong;
	out.print("<p style='color:green;font-weight:bold'>Tên hoa: "+tenHoa+"</p>");
	out.print("<p style='color:green;font-weight:bold'>\nGiá bán: "+giaBan+ " VND  - \tSố lượng : "+ soLuong+ "</p>");
	out.print("<h4 style='color:red;font-weight:bold'>Thành tiền : "+ thanhTien+"</h4>");
	
}
}