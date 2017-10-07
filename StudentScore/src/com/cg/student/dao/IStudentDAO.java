package com.cg.student.dao;

import java.util.ArrayList;

import com.cg.student.bean.StudentBean;

public interface IStudentDAO {

	int addStudent(StudentBean bean);

	ArrayList<StudentBean> retrieveStudent();

}
