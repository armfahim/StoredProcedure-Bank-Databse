package com.storedProcedure.model;

public class Branch {
	
	private String branch_name;
	private String branch_city;
	private float assets;
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_city() {
		return branch_city;
	}
	public void setBranch_city(String branch_city) {
		this.branch_city = branch_city;
	}
	public float getAssets() {
		return assets;
	}
	public void setAssets(float assets) {
		this.assets = assets;
	}
	
	
}
