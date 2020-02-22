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
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AccountService accountService = new AccountServiceImp();
		Account account =null;
		Address address = null;
		List<Account> list = null;
		while(true) {
			System.out.println("1. add");
			System.out.println("2. list");
			
			System.out.println("3. update");
			System.out.println("4. exit");
			System.out.println("enter choice");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				try {
				account = new Account();
				address = new Address();
				System.out.println("enter name");
				String name = sc.next();
				account.setAccountName(name);
				
				System.out.println("enter aadhar");
				String aadhar = sc.next();
				account.setAccountAadhar(aadhar);
				
				System.out.println("enter pan");
				String pan = sc.next();
				account.setAccountPan(pan);
				
				System.out.println("enter dob");
				String dob = sc.next();
				account.setAccountDob(dob);
				
				System.out.println("enter address");
				
				System.out.println("house number:");
				String hno = sc.next();
				address.setHouseNo(hno);
				
				System.out.println("street:");
				String street = sc.next();
				address.setStreet(street);
				
				System.out.println("city:");
				String city = sc.next();
				address.setCity(city);
				
				System.out.println("state:");
				String state = sc.next();
				address.setState(state);
				
				System.out.println("pincode:");
				String pin = sc.next();
				address.setPincode(pin);
				account.setAccountAddress(address);
				
				System.out.println("enter gender");
				String gender = sc.next();
				account.setAccountGender(gender);
				
				System.out.println("enter contact number");
				String contact = sc.next();
				account.setAccountContact(contact);
				
				String accountNumber = accountService.addAccount(account);
				System.out.println("Account created (Account Number : "+accountNumber+")");
				}
				catch(AccountException e) {
					System.out.println(e.getMessage());
				}break;
			
			case 2:
				try {
					list = accountService.listAccounts();
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
