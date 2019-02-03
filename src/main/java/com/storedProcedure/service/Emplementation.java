package com.storedProcedure.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.storedProcedure.dao.AccountDao;
import com.storedProcedure.dao.BranchDao;
import com.storedProcedure.dao.CustomerDao;
import com.storedProcedure.dao.DepositorDao;
import com.storedProcedure.dbUtil.DBConnection;
import com.storedProcedure.model.Account;
import com.storedProcedure.model.Branch;
import com.storedProcedure.model.Customer;
import com.storedProcedure.model.Depositor;



public class Emplementation implements CustomerDao,BranchDao,AccountDao,DepositorDao{
	
	DBConnection c = new DBConnection();
	Connection con = null;
	CallableStatement stmt = null;
	ResultSet res = null;
	
	//Question 01
	public List<Customer> getAllCustomers()
	{
		try{
			con = c.createConnection();
			String sp="{call G4_AllCustomerName}";
			stmt = con.prepareCall(sp);
			
		    res = stmt.executeQuery();
			
			List <Customer> customerList = new ArrayList<Customer>();
			while(res.next())
			{
				  Customer a = new Customer();
			      a.setCustomer_name(res.getString("customer_name"));
			      customerList.add(a);
			}
			return customerList;
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
	    return null;
		
	}
	
	
	//Question 02
	public List<Branch> getAllBranches()
	{
		try{
			con = c.createConnection();
			String sp="{call G4_AllBranchNameWithLoanRelation}";
			stmt = con.prepareCall(sp);
			
		    res = stmt.executeQuery();
			
			List <Branch> branchList = new ArrayList<Branch>();
			while(res.next())
			{
				  Branch b = new Branch();
			      b.setBranch_name(res.getString("branch_name"));
			      branchList.add(b);
			}
			return branchList;
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	
	//Question 03
	@Override
	public List<Branch> getAllBranches2() {
		try{
			con = c.createConnection();
			String sp="{call G4_DisplayEntireBranch}";
			stmt = con.prepareCall(sp);
			
		    res = stmt.executeQuery();
			
			List <Branch> branchList = new ArrayList<Branch>();
			while(res.next())
			{
				  Branch b = new Branch();
			      b.setBranch_name(res.getString("branch_name"));
			      b.setBranch_city(res.getString("branch_city"));
			      b.setAssets(res.getFloat("assets"));
			      branchList.add(b);
			}
			return branchList;
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	//Question 04
	public List<Account> getAllAccounts()
	{
		try{
			con = c.createConnection();
			String sp="{call G4_AllAccountsWhereBalanceGreaterThan$700}";
			stmt = con.prepareCall(sp);
			
		    res = stmt.executeQuery();
			
			List <Account> accountList = new ArrayList<Account>();
			while(res.next())
			{
				  Account b = new Account();
			      b.setAccount_number(res.getString("account_number"));
			      accountList.add(b);
			}
			return accountList;
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}


	
	
	//Question 05
	
	@Override
	public List<Account> getAccountAndBalance() {
		try{
			con = c.createConnection();
			String sp="{call G4_AccountNumberAndBalanceFromBrightonWhereBalanceGreaterThan$800}";
			stmt = con.prepareCall(sp);
			
		    res = stmt.executeQuery();
			
			List <Account> accountList = new ArrayList<Account>();
			while(res.next())
			{
				  Account b = new Account();
			      b.setAccount_number(res.getString("account_number"));
			      b.setBalance(res.getFloat("balance"));
			      accountList.add(b);
			}
			return accountList;
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

    //Question 06
	@Override
	public List<Branch> getBranchAndAssests() {
		try{
			con = c.createConnection();
			String sp="{call G4_BranchNameAndAssetsFromAllBranchesInThousandsOfDollarsAndRenameAssetsColumnToAssetsInThousands}";
			stmt = con.prepareCall(sp);
			
		    res = stmt.executeQuery();
			
			List <Branch> branchList = new ArrayList<Branch>();
			while(res.next())
			{
				  Branch b = new Branch();
			      b.setBranch_name(res.getString("branch_name"));
			      b.setAssets(res.getFloat("assets in thousands"));
			      branchList.add(b);
			}
			return branchList;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	 //Question 07
	@Override
	public List<Branch> getBranches3() {
		try{
			con = c.createConnection();
			String sp="{call G4_NameOfAllBranchesWithAssetsBetweenOneAndFourMillionDollars}";
			stmt = con.prepareCall(sp);
			
		    res = stmt.executeQuery();
			
			List <Branch> branchList = new ArrayList<Branch>();
			while(res.next())
			{
				  Branch b = new Branch();
			      b.setBranch_name(res.getString("branch_name"));
			      branchList.add(b);
			}
			return branchList;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

//Question 08
	@Override
	public List<Account> getAccountAndBalanceHavingAccount() {
		try{
			con = c.createConnection();
			String sp="{call G4_NameAccountNumberAndBalanceOfAllCustomersWhoHaveAnAccount}";
			stmt = con.prepareCall(sp);
			
		    res = stmt.executeQuery();
			
			List <Account> accountList = new ArrayList<Account>();
			while(res.next())
			{
				  Account a = new Account();
			      a.setAccount_number(res.getString("account_number"));
			      a.setCustomer_name(res.getString("customer_name"));
			      a.setBalance(res.getFloat("balance"));
			      accountList.add(a);
			}
			return accountList;
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	    return null;
	}


	@Override
	public List<Depositor> getAllDepositors() {
		// TODO Auto-generated method stub
		return null;
	}

	//Question 09
	@Override
	public List<Account> getAccountAndBalanceAndName() {
		try{
			con = c.createConnection();
			String sp="{call G4_GetNameAccountNumberAndBalanceOfAllCustomersWhoHaveAnAccountWithBalanceOf$400OrLess}";
			stmt = con.prepareCall(sp);
			
		    res = stmt.executeQuery();
			
			List <Account> accountList = new ArrayList<Account>();
			while(res.next())
			{
				  Account a = new Account();
			      a.setAccount_number(res.getString("account_number"));
			      a.setCustomer_name(res.getString("customer_name"));
			      a.setBalance(res.getFloat("balance"));
			      accountList.add(a);
			}
			return accountList;
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	    return null;
	}
	
	
	
	
	
	

}
