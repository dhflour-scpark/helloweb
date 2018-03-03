package kr.co.dhflour.helloweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;//무시해도 됨
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String n = request.getParameter("n");
		String s = request.getParameter("s");	
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html; charset=utf-8");
		out.println("<h1>hello world</h1>") ;
		out.println("<h4>"+ n + "</h4>") ;
		out.println("<h4>"+ s + "</h4>") ;
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
