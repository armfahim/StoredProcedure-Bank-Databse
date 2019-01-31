package com.storedProcedure.dbUtil;

import java.sql.Connection;


public class DBOperations {
	
	public static void main(String[] args) {
		
		
		DBConnection c = new DBConnection();
		Connection con = c.createConnection();
		
		
	}

}
