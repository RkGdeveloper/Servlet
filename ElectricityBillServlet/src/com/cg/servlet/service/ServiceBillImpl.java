package com.cg.servlet.service;

import com.cg.electricity.CustomerBean;
import com.cg.servlet.dao.DaoBillImpl;
import com.cg.servlet.dao.IDaoBill;

public class ServiceBillImpl implements IServiceBill {

	IDaoBill dao = new DaoBillImpl();
	public int addDetails(CustomerBean bean)
	{
		System.out.println("service");
		return dao.addDetails(bean);
		
	}
}
