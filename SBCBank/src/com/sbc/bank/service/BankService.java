package com.sbc.bank.service;

import com.sbc.bank.dto.Customer;
import com.sbc.bank.exception.BankException;
import com.sbc.bank.exception.InvalidAmount;
import com.sbc.bank.exception.InvalidPhoneNumber;

public interface BankService {
	
	public Customer createAccount(Customer c);
	public double showBalance (String mobileno) throws InvalidPhoneNumber;
	public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, double amount) throws BankException;
	public Customer depositAmount (String mobileNo, double amount ) throws InvalidPhoneNumber, InvalidAmount;
	public Customer withdrawAmount(String mobileNo, double amount) throws BankException;
	public boolean validateUserName(String name);
	public boolean validatePhoneNumber(String mobNo);
	public boolean validateTargetMobNo(String targetMobNo);
	public boolean validateAmount(double amt);
	public boolean validateAll(Customer c);
	
}
