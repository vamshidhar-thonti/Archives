package com.sbc.bank.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sbc.bank.service.BankServiceImpl;

public class SBCBankTest {
	
	@Test
	public void ValidateNameTrue(){
		BankServiceImpl bs = new BankServiceImpl();
		assertEquals(true, bs.validateUserName("Vamshidhar"));
	}
	
//	@Test (expected = InvalidNameFormat.class)
//	public void ValidateUserNameV1(){
//		BankServiceImpl bs = new BankServiceImpl();
		
//	}
	
	@Test
	public void ValidatePhonNumberTrue(){
		BankServiceImpl bs = new BankServiceImpl();
		assertEquals(true, bs.validatePhoneNumber("9632584170"));
	}
	
	@Test
	public void ValidatePhoneNumber(){
		BankServiceImpl bs = new BankServiceImpl();
		assertEquals(false, bs.validatePhoneNumber("963258417"));
		assertEquals(false, bs.validatePhoneNumber("5632584170"));
		assertEquals(false, bs.validatePhoneNumber("584170"));
		assertEquals(false, bs.validatePhoneNumber("testing"));
		assertEquals(false, bs.validatePhoneNumber("@#%"));
	}
	
	@Test 
	public void ValidateNameV2(){
		BankServiceImpl bs = new BankServiceImpl();
		assertEquals(false, bs.validateUserName("Vamshi123"));
		assertEquals(false, bs.validateUserName("Vamshidhar@1234"));
		assertEquals(false, bs.validateUserName("2514533"));
		assertEquals(false, bs.validateUserName("vamshidhar"));
	}
	
	@Test
	public void ValidateAmountTrue(){
		BankServiceImpl bs = new BankServiceImpl();
		assertEquals(true, bs.validateAmount(100));
	}
	
	@Test 
	public void ValidateAmount(){
		BankServiceImpl bs = new BankServiceImpl();
		assertEquals(false, bs.validateAmount(0));
		assertEquals(false, bs.validateAmount(-400));
	}

}
