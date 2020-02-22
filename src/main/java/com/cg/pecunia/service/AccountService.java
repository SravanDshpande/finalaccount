package com.cg.pecunia.service;

import java.util.List;

import com.cg.pecunia.bean.Account;
import com.cg.pecunia.exception.AccountException;

public interface AccountService {
	public String addAccount(Account account) throws AccountException;
	public String updateAccount(String accountNumber, Account account) throws AccountException;
	
	public List<Account> listAccounts() throws AccountException;
	public Account findAccount(String accountNumber) throws AccountException;
	public boolean validateName(String accountName) throws AccountException;
	public boolean validatePan(String accountPan)throws AccountException;
	public boolean validateContact(String accountContact)throws AccountException;
	public boolean validateAadhar(String accountAadhar)throws AccountException;
	public boolean validateGender(String accountGender)throws AccountException;
	public boolean validateDate(String accountDate)throws AccountException;
	public boolean validatePin(String pin) throws AccountException;

}
