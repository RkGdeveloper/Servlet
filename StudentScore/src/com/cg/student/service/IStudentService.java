package com.cg.student.service;

import java.util.ArrayList;

import com.cg.student.bean.StudentBean;

public interface IStudentService {

	int addStudent(StudentBean bean);

	ArrayList<StudentBean> retrieveStudent();

}
