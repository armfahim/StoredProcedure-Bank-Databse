package com.storedProcedure.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	Connection con = null;

	String conUrl = null;

	public DBConnection()

	{

		conUrl = "jdbc:sqlserver://vNTDACLSCRAPR01:1433;"
				+ "databaseName=BankAccountMNG;user=bankaccountmng_dbo;password=bankaccountmng_dbo123";
		
	}

	public Connection createConnection()

	{

		try

		{

			con = DriverManager.getConnection(conUrl);
			System.out.println("Successful");

		}

		catch (Exception e)

		{
            System.out.println("not successful");
		}

		return con;

	}

}
