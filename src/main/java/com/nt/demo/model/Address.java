package com.nt.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private int pinCode;
	@Column
	private String state;
	@Column
	private String addressDetails;
	@Column
	private String town;
	@Column
	private String dist;

	public Address() {
		super();
	}

	public Address(int pinCode, String state, String addressDetails, String town, String dist) {
		super();
		this.pinCode = pinCode;
		this.state = state;
		this.addressDetails = addressDetails;
		this.town = town;
		this.dist = dist;
	}

	public Long getId() {
		return id;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", pinCode=" + pinCode + ", State=" + state + ", addressDetails=" + addressDetails
				+ ", town=" + town + ", dist=" + dist + "]";
	}

}
