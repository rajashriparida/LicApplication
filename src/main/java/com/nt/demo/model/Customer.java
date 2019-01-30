package com.nt.demo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	@Column
	private String customerName;
	@Column
	private String addressId;
	@Column
	private LocalDate dob;
	@Column
	private String gender;
	@Column
	private int phno;
	@Column
	private String emailId;
	@Column
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
