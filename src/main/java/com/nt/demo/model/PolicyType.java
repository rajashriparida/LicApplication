package com.nt.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PolicyType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String pName;
	@Column
	private int amount;
	@Column
	private int policyTerm;
	@Column
	private boolean active;

	public PolicyType() {
		super();
	}

	public PolicyType(String pName, int amount, int policyTerm) {
		super();
		this.pName = pName;
		this.amount = amount;
		this.policyTerm = policyTerm;
	}

	public String getPName() {
		return pName;
	}

	public void setPName(String name) {
		this.pName = name;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "PolicyType [id=" + id + ", name=" + pName + ", amount=" + amount + ", policyTerm=" + policyTerm
				+ ", getName()=" + getPName() + ", getAmount()=" + getAmount() + ", getPolicyTerm()=" + getPolicyTerm()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
