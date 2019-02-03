package com.storedProcedure.dbUtil;

import java.sql.Connection;

import com.storedProcedure.dao.AccountDao;
import com.storedProcedure.dao.BranchDao;
import com.storedProcedure.dao.CustomerDao;
import com.storedProcedure.model.Account;
import com.storedProcedure.model.Branch;
import com.storedProcedure.model.Customer;
import com.storedProcedure.service.Emplementation;


public class DBOperations{
	
	public static void main(String[] args) {
		
		Customer c = new Customer();
		CustomerDao cd = new Emplementation();
		
		Branch b = new Branch();
		BranchDao bd = new Emplementation();
		
		Account a = new Account();
		AccountDao ad = new Emplementation();
		
		//question 01
		
		
//		for(Customer emp2 : cd.getAllCustomers() )
//		{
//			System.out.println(emp2.getCustomer_name()+"\n\n");
//		}
		
//		question 02
//		
//		for(Branch b1 : bd.getAllBranches() )
//		{
//			System.out.println(b1.getBranch_name()+"\n\n");
//		}
//		
//       question 03
//		
//		for(Branch b2 : bd.getAllBranches2() )
//		{
//			System.out.println(b2.getBranch_name()+"\n"+b2.getBranch_city()+"\n"+b2.getAssets()+"\n");
//		}
//       
//       question 04
		
//		for(Account b2 : ad.getAllAccounts() )
//		{
//			System.out.println(b2.getAccount_number()+"\n");
//		}
		
//      question 05
		
//		for(Account b2 : ad.getAccountAndBalance())
//		{
//			System.out.println(b2.getAccount_number()+"\n"+b2.getBalance());
//		}
//		
//      question 06
		
//		for(Branch b2 : bd.getBranchAndAssests())
//		{
//			System.out.println(b2.getBranch_name()+"\n"+b2.getAssets());
//		}
		
//      question 07
		
//		for(Branch b2 : bd.getBranches3())
//		{
//			System.out.println(b2.getBranch_name());
//		}
		
//      question 08
//		
//		for(Account b2 : ad.getAccountAndBalanceHavingAccount())
//		{
//			System.out.println(b2.getCustomer_name()+"\n"+b2.getAccount_number()+"\n"+b2.getBalance());
//		}
//		
//      question 09
		
		for(Account b2 : ad.getAccountAndBalanceAndName())
		{
			System.out.println(b2.getCustomer_name()+"\n"+b2.getAccount_number()+"\n"+b2.getBalance());
		}
		
		
		
	}

	
	}

