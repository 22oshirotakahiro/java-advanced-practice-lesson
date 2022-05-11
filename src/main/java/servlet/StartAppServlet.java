package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.CardGameApp;
import app.ClockApp;
import app.DartsGameApp;

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
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String app = request.getParameter("app");
		String result = "";
		
		if (name == null || name.isEmpty()) {
			result = null;
		} else {
			switch (app) {
			case "CardGameApp":
				CardGameApp cga = new CardGameApp("トランプ");
				result = cga.start(name) + cga.play();
				break;
			case "DartsGameApp":
				DartsGameApp dga = new DartsGameApp("ダーツ");
				result = dga.start(name) + dga.play();
				break;
			case "ClockApp":
				result = new ClockApp().start(name);
				break;
			case "others":
				
				break;
			}
		}
		request.setAttribute("result", result);
		
		request.getRequestDispatcher("appStart.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
