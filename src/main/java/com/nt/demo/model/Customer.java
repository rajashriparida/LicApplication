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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String customerName;
	@Column
	private Long addressId;
	@Column
	private LocalDate dob;
	@Column
	private String gender;
	@Column
	private long phoneNumber;
	@Column
	private String emailId;
	@Column
	private String password;

	public Customer() {
		super();
	}

	public Customer(Long id) {
		super();
		this.id = id;
	}

	public Customer(String customerName, Long addressId, LocalDate dob, String gender, long phoneNumber,
			String emailId) {
		super();
		this.customerName = customerName;
		this.addressId = addressId;
		this.dob = dob;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;

	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
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

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhno(long phoneNumber) {
		this.phoneNumber = phoneNumber;
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
		return "Customer [Id=" + id + ", customerName=" + customerName + ", addressId=" + addressId + ", dob=" + dob
				+ ", gender=" + gender + ", phno=" + phoneNumber + ", emailId=" + emailId + ", password=" + password
				+ "]";
	}

}
