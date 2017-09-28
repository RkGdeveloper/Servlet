package com.cg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserOperation")
public class UserOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		
		
		if(uname.equals("Govind") && upass.equals("corp"))
		{
			ServletContext context=getServletContext();
			context.setAttribute("uname",uname);
			context.setAttribute("upass",upass);
			//request.setAttribute("upass", upass);
			//RequestDispatcher rd=request.getRequestDispatcher("Success")	;
			 //rd.forward(request,response);
			response.sendRedirect("Success");
		}
		else{
			 RequestDispatcher rd=request.getRequestDispatcher("index.html")	;
			 rd.include(request,response);
			 out.print("<font color = 'red'>Invalid username and password</font>");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request,response);
	}

}
