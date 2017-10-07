package com.cg.bank.service;

import com.cg.bank.dao.BankDaoImpl;
import com.cg.bank.dao.IDaoBank;
import com.cg.bank.dto.BankDetails;

public class ServiceBankImpl implements IServiceBank {

	IDaoBank dao = new BankDaoImpl();
	public int addCustomer(BankDetails bean)
	{
		System.out.println("service");
		return dao.addCustomer(bean);
		
	}
	@Override
	public BankDetails retrieveDetails(int cusid) {
		

		BankDetails rd = new BankDetails();
		rd = dao.retrieveDetails(cusid);
		return rd;
	}
}
