package com.cg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Success")
public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext context=getServletContext();
		String uname=(String) context.getAttribute("uname");
		//String upass=(String) request.getAttribute("upass");
		String upass=(String) context.getAttribute("upass");
		out.print("<!DOCTYPE html><html><head><title>User Login</title>"
				+ "<style>header{height:50px; border:1px solid white; "
				+ "text-align:center;background-color:black;"
				+ "font-size:10px;color:white;}"
				+ "</style>"
				+ "</head><body>");
		out.print("<header><h1>Welcome User :"+uname+"</h1></header>");
		out.print("<center><br/>User name : "+uname);
		out.print("<br/>Password : "+upass+"</center>");
		out.print("</body></html>");
	}

}
