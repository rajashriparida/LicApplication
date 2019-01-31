package com.nt.demo.dto;

public class PolicyTypeDto {

	private String pName;
	private int amount;
	private int policyTerm;

	public PolicyTypeDto() {
		super();
	}

	public PolicyTypeDto(String pName, int amount, int policyTerm) {
		super();
		this.pName = pName;
		this.amount = amount;
		this.policyTerm = policyTerm;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPolicyTerm() {
		return policyTerm;
	}

	public void setPolicyTerm(int policyTerm) {
		this.policyTerm = policyTerm;
	}

}
