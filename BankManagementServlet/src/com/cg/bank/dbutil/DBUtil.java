package com.cg.bank.dbutil;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBUtil {

	static Connection conn=null;
	public static Connection getConnection()
	{
		try{
			InitialContext ic=new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:/jdbc/OracleDS");
			conn=ds.getConnection();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
