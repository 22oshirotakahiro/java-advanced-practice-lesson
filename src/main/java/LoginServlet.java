

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String id = (String)request.getAttribute("id");
		String pass = (String)request.getAttribute("pass");
		
		if (Utility.isNullOrEmpty(id) || Utility.isNullOrEmpty(pass)) {
			request.setAttribute("idIsEmpty", true);
			request.setAttribute("passIsEmpty", true);
			request.getRequestDispatcher("login.jsp");
		} else if (id == "axiz" && pass == "axizuser") {
			request.setAttribute("id", "axiz");
			request.getRequestDispatcher("result.jsp");
		} else if (id == "technocore" && pass == "techno-pass") {
			request.setAttribute("id", "technocore");
			request.getRequestDispatcher("result.jsp");
		} else {
			request.setAttribute("mistake", true);
			request.getRequestDispatcher("login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
