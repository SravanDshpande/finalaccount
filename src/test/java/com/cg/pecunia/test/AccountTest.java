package com.cg.pecunia.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.pecunia.dao.AccountDao;
import com.cg.pecunia.dao.AccountDaoImp;
import com.cg.pecunia.service.AccountService;
import com.cg.pecunia.service.AccountServiceImp;

class AccountTest {
AccountDao dao=null;
AccountService serviceDao=null;



	@BeforeEach
	public void setup()
	{
		dao=new AccountDaoImp();
		serviceDao=AccountServiceImp();
	}
	
	
	@Test
	void test() {
		
	}

}
