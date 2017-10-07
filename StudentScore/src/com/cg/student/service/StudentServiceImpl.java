package com.cg.student.service;

import java.util.ArrayList;

import com.cg.student.bean.StudentBean;
import com.cg.student.dao.IStudentDAO;
import com.cg.student.dao.StudentDAOImpl;



public class StudentServiceImpl implements IStudentService {

	IStudentDAO dao = new StudentDAOImpl();
	public int addStudent(StudentBean bean) {
		
		return dao.addStudent(bean);
	}
	@Override
	public ArrayList<StudentBean> retrieveStudent() {
		// TODO Auto-generated method stub
		return dao.retrieveStudent();
	}

}
