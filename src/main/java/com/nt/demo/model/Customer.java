package com.nt.demo.model;

import java.time.LocalDate;

public class Customer {
	private Long Id;
	private String customerName;
	private String addressId;
	private LocalDate dob;
	private String gender;
	private int phno;
	private String emailId;
	private String password;

	public Customer() {
		super();
	}

	public Customer(String customerName, String addressId, LocalDate dob, String gender, int phno, String emailId,
			String password) {
		super();
		this.customerName = customerName;
		this.addressId = addressId;
		this.dob = dob;
		this.gender = gender;
		this.phno = phno;
		this.emailId = emailId;
		this.password = password;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", customerName=" + customerName + ", addressId=" + addressId + ", dob=" + dob
				+ ", gender=" + gender + ", phno=" + phno + ", emailId=" + emailId + ", password=" + password + "]";
	}

}
