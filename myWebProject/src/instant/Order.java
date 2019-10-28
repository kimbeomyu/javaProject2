package instant;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Order
 */
@WebServlet("/order")
public class Order extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Order() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//	response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		
		int price = 0;
		String burger = request.getParameter("burger");
			
		if(burger.equals("한우버거")) {
			price += 5000;
		} else if (burger.equals("밥버거")) {
			price += 4500;
		} else if (burger.equals("치즈버거")){
			price += 4000;
		}
		
		
		String side = request.getParameter("side");
		if(side.equals("감자튀김")) {
			price += 1500;
		} else if (side.equals("어니언링")) {
			price += 1700;
		} 
		
		String drink = request.getParameter("dringk");
	
		if(drink.equals("콜라")) {
			price += 1000;
		} else if (drink.equals("사이다")) {
			price += 1700;
		} else if (drink.equals("커피")) {
			price += 1500;
		} else if (drink.equals("밀크쉐이크")) {
			price += 2500;
		}
		
		
		PrintWriter out = response.getWriter();
		
		
		
		out.println("<html><head><title>result</title></head>");
		out.println("<body>");
		out.println("<p style='background: red'>감사합니다 <br>"+ burger +" "+ side +" "+ drink +"를 주문하셨습니다.");
		out.println("총 금액은 :"+price+"원입니다. </p>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
