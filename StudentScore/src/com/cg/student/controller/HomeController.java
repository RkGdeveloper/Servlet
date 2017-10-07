package com.cg.student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.student.bean.StudentBean;
import com.cg.student.service.IStudentService;
import com.cg.student.service.StudentServiceImpl;

@WebServlet("*.obj")
public class HomeController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String target=null;
		StudentBean bean = new StudentBean();
		IStudentService service=new StudentServiceImpl();
		PrintWriter out=response.getWriter();
		String path=request.getServletPath();
		
		switch(path)
		{
		case "/retrieveDetails.obj" :
			
			
			ArrayList<StudentBean> list = new ArrayList<StudentBean>();
			list=service.retrieveStudent();
			HttpSession session = request.getSession(true);
			session.setAttribute("studentList", list);
			//System.out.println(list);
			target="StudentScores.jsp";
		break;
		
		case "/addDetails.obj" :
			target="NewStudent.jsp";
			
		break;
		case "/add.obj":

			//String studentId = request.getParameter("studentId");
			String studentName = request.getParameter("studentName");
			String age = request.getParameter("age");
			String state = request.getParameter("state");
			String gender = request.getParameter("gender");
			String centum = request.getParameter("centum");
			String attempts = request.getParameter("attempts");
			String totalSub = request.getParameter("totalSub");
			
			//bean.setStudentId(studentId);
			bean.setStudentName(studentName);
			bean.setAge(age);
			bean.setState(state);
			bean.setGender(gender);
			bean.setCentum(centum);
			bean.setAttempts(attempts);
			bean.setTotalSub(totalSub);
			
			int studid = service.addStudent(bean);
			if(studid==1)
			{
				target="success.jsp";
				System.out.println(studid);
			}
			else
			{
				target="error.jsp";
			}
			
			break;
			
		
		}
		RequestDispatcher rd = request.getRequestDispatcher(target);
		rd.forward(request, response);
	}

}
