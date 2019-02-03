package com.storedProcedure.dao;

import java.util.List;

import com.storedProcedure.model.Account;


public interface AccountDao {
	
	public List<Account> getAllAccounts();
	public List<Account> getAccountAndBalance(); 
	public List<Account> getAccountAndBalanceHavingAccount(); 
	public List<Account> getAccountAndBalanceAndName(); 
	
	
	
	
	

}
