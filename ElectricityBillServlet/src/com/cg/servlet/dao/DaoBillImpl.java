package com.cg.servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cg.electricity.CustomerBean;
import com.cg.servlet.dbutil.Dbutil;

public class DaoBillImpl implements IDaoBill {

	int rows=0;
	public int addDetails(CustomerBean bean) {
			try{
		Connection conn = Dbutil.getConnection();
		PreparedStatement ps=conn.prepareStatement("insert into billdetails values(?,?,?,?)");
		ps.setInt(1, bean.getConsumerNum());
		ps.setString(2, bean.getCustName());
		ps.setString(3, bean.getEmailId());
		ps.setString(4, bean.getPhoneNum());
		rows = ps.executeUpdate();
		System.out.println(rows);
			}
			catch(Exception e)
			{
			e.printStackTrace();
			}
		return rows;
	}

}
