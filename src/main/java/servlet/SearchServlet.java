package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Product;
import service.ProductService;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 文字化け対策
        request.setCharacterEncoding("UTF-8");
		
		// 製品IDの取得
		String pIdString = "";
		int productId = 0;
		pIdString = request.getParameter("product_id");
		
		if (pIdString != null && !("".equals(pIdString))) {
			
			productId = Integer.parseInt(pIdString);
			ProductService pService = new ProductService();
			Product p = pService.find(productId);
			
			if (p != null) {
				
				String productName = p.getProductName();
				int price =p.getPrice();
				request.setAttribute("product_id", "製品ID：" + productId);
				request.setAttribute("product_name", "製品名：" + productName);
				request.setAttribute("price", "値段：" + price);
				request.setAttribute("msg", "データを取得しました");
				request.getRequestDispatcher("SearchResult.jsp").forward(request, response);
				
			} else {
				
				request.setAttribute("msg", "対象のデータはありません");
				request.getRequestDispatcher("top.jsp").forward(request, response);
				
			}
			
		} else {
			
			request.setAttribute("msg", "製品IDを入力してください");
			request.getRequestDispatcher("top.jsp").forward(request, response);
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
