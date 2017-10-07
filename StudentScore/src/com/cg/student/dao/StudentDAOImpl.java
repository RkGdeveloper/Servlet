package com.cg.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.student.bean.StudentBean;
import com.cg.student.dbutil.dbutil;

public class StudentDAOImpl implements IStudentDAO {

	@Override
	public int addStudent(StudentBean bean) {
		
		int rows=0;
		int curr=0;
		
				try{
			Connection conn = dbutil.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into Student_score values(sudent_id.nextval,?,?,?,?,?,?,?)");
			
			ps.setString(1,bean.getStudentId());
			ps.setInt(2, Integer.parseInt(bean.getAge()));
			ps.setString(3, bean.getState());
			ps.setString(4, bean.getGender());
			ps.setInt(5, Integer.parseInt(bean.getCentum()));
			ps.setInt(6, Integer.parseInt(bean.getAttempts()));
			ps.setInt(7, Integer.parseInt(bean.getTotalSub()));
			rows = ps.executeUpdate();
			System.out.println(rows+"row inserted");
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
			
			/*PreparedStatement ps1=conn.prepareStatement("select cusid.currval from dual");
			ResultSet rd = ps1.executeQuery();
			while(rd.next())
			{
				curr = rd.getInt(1);
			}
					
				*/
		return rows;
	}

	@Override
	public ArrayList<StudentBean> retrieveStudent() {
	
		Connection conn = dbutil.getConnection();
		ArrayList<StudentBean> list = new ArrayList<StudentBean>(); 
		try {
			PreparedStatement ps1=conn.prepareStatement("select * from Student_score");
			ResultSet rs = ps1.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt(1);
				String studid = String.valueOf(id);
				
				String name=rs.getString(2);
				
				int age=rs.getInt(3);
				String agestud = String.valueOf(age);
				
				String state = rs.getString(4);
				
				String gender = rs.getString(5);
				
				int centum = rs.getInt(6);
				String centumstud = String.valueOf(centum);
				
				int attempts = rs.getInt(7);
				String  attemptsstud = String.valueOf(attempts);
				
				int total = rs.getInt(8);
				String totalstud = String.valueOf(total);
				
				list.add(new StudentBean(studid,name,agestud,state,gender,centumstud,attemptsstud,totalstud));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
		return list;
	}
	

	
}
