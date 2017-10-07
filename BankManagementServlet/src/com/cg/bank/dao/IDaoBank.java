package com.cg.bank.dao;

import com.cg.bank.dto.BankDetails;

public interface IDaoBank {

	int addCustomer(BankDetails bean);
	public BankDetails retrieveDetails(int cusid);
}
