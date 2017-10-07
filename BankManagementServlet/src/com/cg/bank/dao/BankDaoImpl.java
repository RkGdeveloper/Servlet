package com.cg.bank.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.bank.dbutil.DBUtil;
import com.cg.bank.dto.BankDetails;

public class BankDaoImpl implements IDaoBank {

	@Override
	public int addCustomer(BankDetails bean) {
		
		int rows=0;
		int curr=0;
		
				try{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into bankdetails values(cusid.nextval,?,?,?)");
			ps.setString(1, bean.getuName());
			ps.setLong(2, bean.getPhone());
			ps.setString(3, bean.getPassword());
			rows = ps.executeUpdate();
			System.out.println(rows);
				
			
			PreparedStatement ps1=conn.prepareStatement("select cusid.currval from dual");
			ResultSet rd = ps1.executeQuery();
			while(rd.next())
			{
				curr = rd.getInt(1);
			}
					
				}
				catch(Exception e)
				{
				e.printStackTrace();
				}
			return curr;
			
}
	public BankDetails retrieveDetails(int cusid)
	{
		BankDetails rd = new BankDetails();
		try {
		Connection conn;
		
		conn = DBUtil.getConnection();
		String str = "select * from bankdetails where cus_id=?";
		
		PreparedStatement ps;
		
			ps = conn.prepareStatement(str);
			ps.setInt(1, cusid);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				rd.setuName(rs.getString(2));
				rd.setPhone(rs.getLong(3)); 
				rd.setPassword(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(rd);
		return rd;
		
	}
}