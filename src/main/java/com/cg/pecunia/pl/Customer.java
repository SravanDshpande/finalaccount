package com.cg.pecunia.pl;

import java.util.List;
import java.util.Scanner;

import com.cg.pecunia.bean.Account;
import com.cg.pecunia.bean.Address;
import com.cg.pecunia.exception.AccountException;
import com.cg.pecunia.service.AccountService;
import com.cg.pecunia.service.AccountServiceImp;

public class Customer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AccountService accountService = new AccountServiceImp();
		Account account =null;
		Address address = null;
		List<Account> list = null;
		while(true) {
			System.out.println("1. Add Account");
			System.out.println("2. List Accounts");
			
			System.out.println("3. Update Account");
			System.out.println("4. Exit");
			System.out.println("enter choice");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				try {
				account = new Account();
				address = new Address();
				
				
				System.out.println("First name ");
				String fName = sc.next();
				if (!accountService.validateName(fName))
					throw new AccountException("Customer name. only alphabets ");			
				account.setAccountName(fName);
				System.out.println("Last name ");
				String lname = sc.next();
				if (!accountService.validateName(lname))
					throw new AccountException("Customer name. only alphabets ");

				account.setAccountName2(lname);
				
				
			
				System.out.println("Enter Aadhar number ");
				String aadhar = sc.next();  
				if (!accountService.validateAadhar(aadhar))
					throw new AccountException("Customer Aadhar: Only 12-digit numbers allowed. ");
				
				
				account.setAccountAadhar(aadhar);
			
				
				
				
				System.out.println("Enter Pan number ");
				String pan = sc.next();
				if (!accountService.validatePan(pan))
					throw new AccountException("Customer pan: (5 alphabets 4 numbers and 1 alphabet ");
				
				account.setAccountPan(pan);
				
				
				
				
				
					
				
				System.out.println("Enter dob ");
				String dob = sc.next();
				if (!accountService.validateDate(dob))
					throw new AccountException("Customer dob:(dd/mm/yyyy) ");
				account.setAccountDob(dob);
				
				
				
				
				System.out.println("Enter Address HNo. (ex:5-8-124/...)");
				String hno = sc.next();
				
				address.setHouseNo(hno);
				
				System.out.println("street:  ");
				String street = sc.next();
				address.setStreet(street);
				
				System.out.println("city: (ex:Hyderabad)");
				String city = sc.next();
				address.setCity(city);
				
				System.out.println("state: (ex Telangana)");
				String state = sc.next();
				address.setState(state);
				
				System.out.println("pincode: (6 digit num)");
				String pin = sc.next();
				address.setPincode(pin);
				account.setAccountAddress(address);
				
				
			
				System.out.println("Enter Gender ");
				String gender = sc.next();
				if (!accountService.validateGender(gender))
					throw new AccountException("Customer grnder:(male/female) ");
				account.setAccountGender(gender);
				
				
				
				System.out.println("Enter Contact number ");
				String contact = sc.next();
				if (!accountService.validateContact(contact))
					throw new AccountException("Customer contact (10 digit number)");
				account.setAccountContact(contact);
				
				
				System.out.println("correct details(Y/N)?");
				char correct=sc.next().charAt(0);
				if(correct=='Y' ||correct=='y' ) {
					
				
				
				String accountNumber = accountService.addAccount(account);
				System.out.println("Account created (Account Number : "+accountNumber+")");
				}
				else
					break;
			}
				catch(AccountException e) {
					System.out.println(e.getMessage());
				}break;
			
			case 2:
				try {
					list = accountService.listAccounts();
					if(list.isEmpty())
					{
						throw new AccountException("empty list");
					}
					for(Account a: list)
						System.out.println(a);
					
				}
				catch(AccountException e) {
					System.out.println(e.getMessage());
				}break;
			
				
		
			case 3:
				try {
					address = new Address();
					System.out.println("update account details");
					System.out.println("enter account number");
					String acc = sc.next();
					account = accountService.findAccount(acc);
					System.out.println("update contact");
					String contact = sc.next();
					account.setAccountContact(contact);
					System.out.println("update address");
					System.out.println("update house no:");
					String hno = sc.next();
					address.setCity(hno);
					System.out.println("update city");
					String city = sc.next();
					address.setCity(city);
					System.out.println("update state");
					String state = sc.next();
					address.setState(state);
					System.out.println("update pin");
					String pin = sc.next();
					address.setPincode(pin);
					account.setAccountAddress(address);
					
					String upd = accountService.updateAccount(acc, account);
					System.out.println(upd);
					
					
					
					
				}
				catch(AccountException e) {
					System.out.println(e.getMessage());
				}break;
				
			case 4:
				System.out.println("thankyou");
				return;
			default : System.out.println("enter valid options");
				break;
			}
		}
		
	}

}
