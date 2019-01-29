package com.nt.demo.model;

public class Address {
	private int id;
	private int pinCode;
	private String State;
	private String addressDetails;
	private String town;
	private String dist;

	public Address() {
		super();
	}

	public Address(int pinCode, String state, String addressDetails, String town, String dist) {
		super();
		this.pinCode = pinCode;
		State = state;
		this.addressDetails = addressDetails;
		this.town = town;
		this.dist = dist;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
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
		return "Address [id=" + id + ", pinCode=" + pinCode + ", State=" + State + ", addressDetails=" + addressDetails
				+ ", town=" + town + ", dist=" + dist + "]";
	}

}
