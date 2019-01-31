package com.storedProcedure.model;

public class Borrower {
	
	private int customer_id;
	private String customer_name;
	private String loan_number;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getLoan_number() {
		return loan_number;
	}
	public void setLoan_number(String loan_number) {
		this.loan_number = loan_number;
	}
	
	

}
