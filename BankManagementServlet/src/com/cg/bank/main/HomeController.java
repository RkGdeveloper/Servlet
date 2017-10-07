package com.cg.bank.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bank.dto.BankDetails;
import com.cg.bank.service.IServiceBank;
import com.cg.bank.service.ServiceBankImpl;


/**
 * Servlet implementation class HomeController
 */
@WebServlet("*.obj")
public class HomeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String target=null;
		BankDetails bean = new BankDetails();
		IServiceBank service=new ServiceBankImpl();
		PrintWriter out=response.getWriter();
		String path=request.getServletPath();
		int flag = 0;
		
		switch(path)
		{
		case "/add.obj" :
			
			target = "CustomerForm.html";
		break;
		case "/Customer.obj":
		
			
			String uName = request.getParameter("uName");
			String phone =  request.getParameter("phone");
			long phoneno = Long.parseLong(phone);
			String password = request.getParameter("password");
			String rePassword = request.getParameter("rePassword");
			
			if(password.equals(rePassword))
			{
				bean.setuName(uName);
				bean.setPhone(phoneno);
				bean.setPassword(password);
				bean.setRePassword(rePassword);
			
				int cusid = service.addCustomer(bean);
				
				/*if(res==1)
				{
					target="Success.html";
				}
				else
				{
					target="Error.html";
				}*/
				HttpSession session = request.getSession();
				session.setAttribute("seqid", cusid);
				//bean = service.retrieveDetails(cusid);
				//session.setAttribute("details", bean);
				target="Success.jsp";
			}
			else 
				{
					flag=1;
					
					out.print("<font color='red'>Passwords not matching</font>");
					target="CustomerForm.html";
					RequestDispatcher rd = request.getRequestDispatcher(target);
					rd.include(request, response);
				}
			
			
			break;
			
		case "/paybill.obj":
			
			target="PayBill.jsp";
			break;
			
		case "/display.obj":
			String Amount = request.getParameter("payAmount");
			System.out.println(Amount);
			int payAmount = Integer.parseInt(Amount);
			int total=1000-payAmount;
			HttpSession session = request.getSession();
			session.setAttribute("total",total);
			target="DisplayBill.jsp";
			break;
			
		case "/cusid.obj":
			target="retrieve.jsp";
			break;
		case "/retrieve.obj":
			 String cusno = request.getParameter("custoid");
			 int customerid = Integer.parseInt(cusno);
			bean = service.retrieveDetails(customerid);
			HttpSession session1 = request.getSession();
			session1.setAttribute("details", bean);
			target="disp_retrieve.jsp";
			break;
	}
			
	if(flag == 0)
	{
		RequestDispatcher rd = request.getRequestDispatcher(target);
		rd.forward(request, response);
	}



	}
}

	

