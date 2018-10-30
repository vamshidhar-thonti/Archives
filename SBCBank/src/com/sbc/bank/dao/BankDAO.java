package com.sbc.bank.dao;

import com.sbc.bank.dto.Customer;
import com.sbc.bank.exception.BankException;

public interface BankDAO {
	
	public Customer createAccount(Customer c);
	public double showBalance (String mobileno);
	public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, double amount) throws BankException;
	public Customer depositAmount (String mobileNo, double amount );
	public Customer withdrawAmount(String mobileNo, double amount) throws BankException;

}
