package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.App;
import app.CardGameApp;
import app.ClockApp;
import app.DartsGameApp;
import app.GameApp;
import entity.Utility;

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
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String app = request.getParameter("app");
		String result = "";
		String playTime = "";
		
		if (Utility.isNullOrEmpty(name)) {
			result = null;
		} else {
			
			App ap = null;
			switch (app) {
			case "CardGameApp":
				ap = new CardGameApp("トランプ");
				break;
			case "DartsGameApp":
				ap = new DartsGameApp("ダーツ");
				break;
			case "ClockApp":
				ap = new ClockApp();
				break;
			case "others":
				
				break;
			}
			
			if (ap != null) {
				result = ap.start(name);
				if (ap instanceof GameApp) {
					GameApp gap = (GameApp)ap;
					playTime = "実行時間：" + gap.getPlayTime() + "分";
				}
			}
			
		}
		request.setAttribute("result", result);
		request.setAttribute("playTime", playTime);
		
		request.getRequestDispatcher("appStart.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
