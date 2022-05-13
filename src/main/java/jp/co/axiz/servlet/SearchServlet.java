package jp.co.axiz.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Utility;

/**
 * Servlet implementation class StartAppServlet
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	String enWord = request.getParameter("english");
    	String result = "";
    	
    	if (!Utility.isNullOrEmpty(enWord)) {
    		
    		HashMap<String, String> dic = new Dictionary().getDictionaryInfo();
    		if (dic.containsKey(enWord)) {
    			
    			String jpWord = dic.get(enWord);
    			result = "英語：" + enWord + "、日本語：" + jpWord;
    			
    		} else {
    			result = "見つかりませんでした";
    		}
    		
    	}

		request.setAttribute("result", result);
        request.getRequestDispatcher("dictionary.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        doGet(request, response);
    }
}
