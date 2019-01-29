package com.nt.demo.model;

public class PolicyType {
	private int id;
	private String name;
	private int amount;
	private int policyTerm;

	public PolicyType() {
		super();
	}

	public PolicyType(String name, int amount, int policyTerm) {
		super();
		this.name = name;
		this.amount = amount;
		this.policyTerm = policyTerm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "PolicyType [id=" + id + ", name=" + name + ", amount=" + amount + ", policyTerm=" + policyTerm
				+ ", getName()=" + getName() + ", getAmount()=" + getAmount() + ", getPolicyTerm()=" + getPolicyTerm()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
