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
AccountService service=null;




	@BeforeEach
	public void setup()
	{
		dao=new AccountDaoImp();
	service=new AccountServiceImp();
	}
	
	
	@Test
	void test() throws AccountException
	{
		Account customeraccount=new Account();
		dao.addAccount(customeraccount);
		customeraccount.setAccountName("sravan");
		customeraccount.setAccountAadhar("123456799456");
		customeraccount.setAccountPan("WERTY1234L");
		customeraccount.setAccountDob("22-02-1998");
		customeraccount.setAccountContact("1234567894");
		customeraccount.setAccountGender("male");
      		List<Account> l=dao.listAccounts();
      		assertEquals(1,l.size());
	}
        @Test
	void testValidatePan()throws AccountException
	{
		boolean status1=service.validatePan("ASDFG1344G");
		boolean status2=service.validatePan("asdfgh124l");
		assertEquals(true, status1);
		assertEquals(false, status2);
		
	}
	
	@Test
	void testValidateAadhar()throws AccountException
	{
		boolean status1=service.validateAadhar("123456789456");
		boolean status2=service.validateAadhar("12345678945");
		assertEquals(true, status1);
		assertEquals(false, status2);
		
	}

}
