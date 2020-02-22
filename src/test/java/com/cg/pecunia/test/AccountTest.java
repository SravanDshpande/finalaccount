package com.cg.pecunia.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.pecunia.bean.Account;
import com.cg.pecunia.dao.AccountDao;
import com.cg.pecunia.dao.AccountDaoImp;
import com.cg.pecunia.exception.AccountException;
import com.cg.pecunia.service.AccountService;
import com.cg.pecunia.service.AccountServiceImp;

class AccountTest {
AccountDao dao=null;




	@BeforeEach
	public void setup()
	{
		dao=new AccountDaoImp();
	
	}
	
	
	@Test
	void test() throws AccountException
	{
		Account acc=new Account();
		dao.addAccount(acc);
		acc.setAccountName("sravan");
		acc.setAccountAadhar("123456799456");
		acc.setAccountPan("WERTY1234L");
		acc.setAccountDob("22-02-1998");
		acc.setAccountContact("1234567894");
		acc.setAccountGender("male");
      		List<Account> l=dao.listAccounts();
      		assertEquals(1,l.size());
	}

}
