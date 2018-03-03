package kr.co.dhflour.helloweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/table")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String r = request.getParameter("r");
	    String c = request.getParameter("c");
	    
	    int row = Integer.parseInt(r);
	    int col = Integer.parseInt(c);
	    
	    response.setContentType("text/html; cahrset=utf-8"); 
	    
	    PrintWriter out = response.getWriter();
	    
	    out.println("<table border ='1' cellpadding='10' cellspacing='0'>");
	    for(int i = 0;i < row;i++) {
	    	out.println("<tr>");
	    	
	    	for(int j =0;j < col;j++) {
	    		out.println("<td>data(" + i + ", " + j + ")</td>");
	    	}
	    	
	    	out.println("</tr>");
	    }	    
	    out.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
