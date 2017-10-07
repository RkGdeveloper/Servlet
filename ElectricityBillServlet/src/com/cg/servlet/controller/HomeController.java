package com.cg.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.electricity.CustomerBean;
import com.cg.servlet.service.IServiceBill;
import com.cg.servlet.service.ServiceBillImpl;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("*.obj")
public class HomeController extends HttpServlet {
	
		
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String target=null;
		CustomerBean bean = new CustomerBean();
		IServiceBill service=new ServiceBillImpl();
		
		String path=request.getServletPath();
		switch(path)
		{
		case "/customer.obj" :
			String consumerNo = request.getParameter("consumerNum");
			int consNum = Integer.parseInt(consumerNo);
			String cusName = request.getParameter("custName");
			String emailID = request.getParameter("emailId");
			String phone = request.getParameter("phoneNum");
			bean.setConsumerNum(consNum);
			bean.setCustName(cusName);
			bean.setEmailId(emailID);
			bean.setPhoneNum(phone);
			System.out.println("client1");
			int res = service.addDetails(bean);
			if(res==1)
			{
				target="Success.html";
			}
			else
			{
				target="Error.html";
			}
			break;
		}
		RequestDispatcher rd = request.getRequestDispatcher(target);
		rd.forward(request, response);
	}


}
