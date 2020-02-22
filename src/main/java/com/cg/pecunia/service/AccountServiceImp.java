package com.cg.pecunia.service;

import java.util.List;
import java.util.Random;

import com.cg.pecunia.bean.Account;
import com.cg.pecunia.dao.AccountDao;
import com.cg.pecunia.dao.AccountDaoImp;
import com.cg.pecunia.exception.AccountException;

public class AccountServiceImp implements AccountService{

	AccountDao accountDao;
	public AccountServiceImp() {
		
		accountDao = new AccountDaoImp() ;
	}
	@Override
	public String addAccount(Account account) throws AccountException {
		if (!validateName(account.getAccountName()))
			throw new AccountException("Customer name. only alphabets ");
		
		if (!validateAadhar(account.getAccountAadhar()))
			throw new AccountException("Customer Aadhar: Only 12-digit numbers allowed. ");
		
		
		if (!validatePan(account.getAccountPan()))
			throw new AccountException("Customer PAN: First 5 characters should be alphabets, next 4 should be digits and the last character should be an alphabet.");
		
		
		if(!validatePin(account.getAccountAddress().getPincode()))
			throw new AccountException(" pin code should be 6 digits");
		
		if (!validateGender(account.getAccountGender()))
			throw new AccountException("Customer Gender: Male/Female fields are accepted. ");
	
		if (!validateContact(account.getAccountContact()))
			throw new AccountException("Customer number: Only numbers allowed. ");
		
		
		
		
		
	
		Random random = new Random();
		long id = random.nextInt((int) 10000000000l)+100000000000l;
		String sid = Long.toString(id);
		account.setAccountNumber(sid);
		return accountDao.addAccount(account);
	}
	@Override
	public List<Account> listAccounts() throws AccountException {
		
		return accountDao.listAccounts();
	}

	
	@Override
	public String updateAccount(String accountNumber, Account account) throws AccountException {
		
		return accountDao.updateAccount(accountNumber, account);
	}
	@Override
	public Account findAccount(String accountNumber) throws AccountException {
		
		return accountDao.findAccount(accountNumber);
	}
	@Override
	public boolean validateName(String accountName) throws AccountException {
		
		return accountName.matches("[A-Za-z]+");
	}
	@Override
	public boolean validatePan(String accountPan) throws AccountException {
		
		return accountPan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}
	@Override
	public boolean validateContact(String accountContact) throws AccountException {
		
		return accountContact.matches("[0-9]{10}");
	}
	@Override
	public boolean validateAadhar(String accountAadhar) throws AccountException {
		
		return accountAadhar.matches("[0-9]{12}");

	}
	@Override
	public boolean validateGender(String accountGender) throws AccountException {
		
		if((accountGender.equals("male")) || (accountGender.equals("female")))
			return true;
		return false;
	}
	@Override
	public boolean validateDate(String accountDate) throws AccountException {
		
		return accountDate.matches("^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$");
	}
	@Override
	public boolean validatePin(String pin) throws AccountException {
		
		return pin.matches("[0-9]{6}");
	}

}
