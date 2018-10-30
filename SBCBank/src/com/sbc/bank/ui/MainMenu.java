package com.sbc.bank.ui;

import java.util.Scanner;

import com.sbc.bank.dto.Customer;
import com.sbc.bank.exception.BankException;
import com.sbc.bank.exception.InvalidAmount;
import com.sbc.bank.exception.InvalidPhoneNumber;
import com.sbc.bank.exception.NameException;
import com.sbc.bank.service.BankService;
import com.sbc.bank.service.BankServiceImpl;

public class MainMenu {

	public static void main(String[] args) throws InvalidPhoneNumber, InvalidAmount, NameException, BankException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		BankService service = null;
		
		int option;
		do{
			
			System.out.println("1. Customer Account...");
			System.out.println("2. Show Balance...");
			System.out.println("3. Fund Transfer...");
			System.out.println("4. Deposit Amount...");
			System.out.println("5. Withdraw Amount...");
			System.out.println("6. Exit...");
			option = sc.nextInt();
			
			switch (option) {
			case 1:

				service = new BankServiceImpl();
				
				System.out.println("Enter Customer Name: ");
				String name = sc.next();
				if(!service.validateUserName(name)){
					throw new NameException();
				}
				System.out.println("Enter Mobile Number: ");
				String mobNo = sc.next();
				if(!service.validatePhoneNumber(mobNo)){
					throw new InvalidPhoneNumber();
				}
				System.out.println("Enter Initial Amount: ");
				double amt = sc.nextDouble();
				if(!service.validateAmount(amt)){
					throw new InvalidAmount();
				}
				
				Customer c = new Customer(name, mobNo, amt);
				Customer c1 = null;
				if(service.validateAll(c))
					c1 = service.createAccount(c);
				else
					throw new BankException("Invalid details...");
				System.out.println(c1);
				System.out.println("Successfully created new account for "+c1.getCustomerName()+" with "
						+ "Mobile Number "+c1.getMobileNumber());
				break;
			
			case 2:
				
				System.out.println("Enter an existing mobile number: ");
				String mobNoShow = sc.next();
				if(!service.validatePhoneNumber(mobNoShow)){
					throw new InvalidPhoneNumber();
				}
				
				double bal = service.showBalance(mobNoShow);
				System.out.println("Available balance for the mobile number "+mobNoShow+" is " +bal);
				
				break;
			
			case 3:
				
				System.out.println("Enter your mobile number: ");
				String sourceMobileNo = sc.next();
				if(!service.validatePhoneNumber(sourceMobileNo)){
					throw new InvalidPhoneNumber();
				}
				System.out.println("Enter recipient's mobile number: ");//check whether mobile number exists in the DB/Collections.
				String targetMobileNo = sc.next();
				if(!service.validatePhoneNumber(targetMobileNo)){
					throw new InvalidPhoneNumber();
				}
				System.out.println("Enter the amount that to be transfered: ");
				double amount = sc.nextDouble();
				if(!service.validateAmount(amount)){
					throw new InvalidAmount();
				}
				
				service = new BankServiceImpl();
				Customer funds = null;
				funds = service.fundTransfer(sourceMobileNo, targetMobileNo, amount);
				System.out.println("Successfully transfered Rs."+amount+" to "+targetMobileNo+".\n"
						+ "Available balance is Rs. "+funds.getAmount());
				
				break;
			
			case 4:
				
				System.out.println("Enter your mobile number: ");
				String mobNoDep = sc.next();
				if(!service.validatePhoneNumber(mobNoDep)){
					throw new InvalidPhoneNumber();
				}
				System.out.println("Enter amount that to be deposited: ");
				double amtDep = sc.nextDouble();
				if(!service.validateAmount(amtDep)){
					throw new InvalidAmount();
				}
				
				service = new BankServiceImpl();
				Customer cDep = service.depositAmount(mobNoDep, amtDep);
				
				System.out.println("Your current balance is Rs."+cDep.getAmount());
//				System.out.println(cDep);
				
				break;
			
			case 5:
				
				System.out.println("Enter your mobile number: ");
				String mobNoWiDraw= sc.next();
				if(!service.validatePhoneNumber(mobNoWiDraw)){
					throw new InvalidPhoneNumber();
				}
				System.out.println("Enter amount that to be withdrawn: ");
				double amtWiDraw = sc.nextDouble();
				if(!service.validateAmount(amtWiDraw)){
					throw new InvalidAmount();
				}
				
				service = new BankServiceImpl();
				Customer cWD= service.withdrawAmount(mobNoWiDraw, amtWiDraw);
				
				System.out.println("Your current balance is Rs. "+cWD.getAmount());
				
				break;
			
			default:
			case 6:
				break;
			}
			
		}while(option != 6);
		
			
		sc.close();
	}

}
