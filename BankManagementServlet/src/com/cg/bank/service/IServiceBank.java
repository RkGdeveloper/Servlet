package com.cg.bank.service;

import com.cg.bank.dto.BankDetails;

public interface IServiceBank {

	public int addCustomer(BankDetails bean);
	public BankDetails retrieveDetails(int cusid);
}
