package com.sbc.bank.dao;

import java.sql.Connection;
import java.util.Map;
import java.util.Set;

import com.sbc.bank.dto.Customer;
import com.sbc.bank.exception.BankException;

public class BankDAOImpl implements BankDAO {
	
	Map<String, Customer> map;
//	public Connection con;
	
	public BankDAOImpl() {
		map = DataContainer.createCollection();
//		con = DBConnection.getConnection();
	}
	
//	public Connection con;
//	
//	public BankDAOImpl() {
//		con = DBConnection.getConnection();
//	}

	@Override
	public Customer createAccount(Customer c) {
		// TODO Auto-generated method stub
		map.put(c.getMobileNumber(), c);
		return c;
	}

	@Override
	public double showBalance(String mobileno) {
		// TODO Auto-generated method stub
		Customer cShow = map.get(mobileno);
		double bal = cShow.getAmount();
		return bal;
	}

	@Override
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, double amount) throws BankException {
		// TODO Auto-generated method stub
		Customer cfunds = map.get(sourceMobileNo);
		Customer cfundr = map.get(targetMobileNo);
		if((cfunds.getAmount()-amount) >= 0){
			cfundr.setAmount(cfundr.getAmount()+amount);
			map.put(targetMobileNo, cfundr);
			cfunds.setAmount(cfunds.getAmount()-amount);
			map.put(sourceMobileNo, cfunds);
			
//			Set<String> set = map.keySet();
//			for(Set<String> c : set){
//				if(c.con)
//			}
			
		}
		else
			throw new BankException("Make sure that overall balance is greater than zero...");
		
//		cfunds = new Customer();
		return cfunds;
	}

	@Override
	public Customer depositAmount(String mobileNo, double amount) {
		// TODO Auto-generated method stub
		Customer cDep = map.get(mobileNo);
		cDep.setAmount(cDep.getAmount()+amount);
		map.put(mobileNo, cDep);
		
		return cDep;
	}

	@Override
	public Customer withdrawAmount(String mobileNo, double amount) throws BankException {
		// TODO Auto-generated method stub
		Customer cDep = map.get(mobileNo);
		if((cDep.getAmount()-amount) >= 0){
			cDep.setAmount(cDep.getAmount()-amount);
			map.put(mobileNo, cDep);
		}
		else
			throw new BankException("Unable to withdraw money...\n"
					+ "Make sure that the balance should be greater than or equal to zero");
		return cDep;
	}

}
