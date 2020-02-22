package com.cg.pecunia.dao;

import java.util.List;

import com.cg.pecunia.bean.Account;
import com.cg.pecunia.exception.AccountException;

public interface AccountDao {
	public String addAccount(Account account) throws AccountException;
	public String updateAccount(String accountNumber, Account account) throws AccountException;

	public List<Account> listAccounts() throws AccountException;
	public Account findAccount(String accountNumber) throws AccountException;
}
