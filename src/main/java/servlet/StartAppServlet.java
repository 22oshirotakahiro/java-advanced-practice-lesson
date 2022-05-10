package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.CardGameApp;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet({ "/StartAppServlet", "/StartApp" })
public class StartAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet() 
     */
    public StartAppServlet() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String app = request.getParameter("app");
		String name = request.getParameter("name");
		String result = "";
		
		CardGameApp cga1 = null;
		if (app != null || !app.isEmpty()) {
			cga1 = new CardGameApp(app);
		}
		if (name == null || name.isEmpty()) {
			result = null;
		} else {
			result = cga1.start(name);
		}
		request.setAttribute("result", result);
		
		request.getRequestDispatcher("appStart.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
