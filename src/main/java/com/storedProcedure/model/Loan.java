package com.storedProcedure.model;

public class Loan {
	
	private String loan_number;
	private String branch_name;
	private float  amount;
	private int customer_id;
	public String getLoan_number() {
		return loan_number;
	}
	public void setLoan_number(String loan_number) {
		this.loan_number = loan_number;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	
	

}
