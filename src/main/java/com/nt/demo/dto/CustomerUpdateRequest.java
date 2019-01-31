/**
 * 
 */
package com.nt.demo.dto;

/**
 * @author Rajashree
 *
 */
public class CustomerUpdateRequest {
	private Long id;

	private int phno;
	private AddressRequest addressRequest;

	public Long getId() {
		return id;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public AddressRequest getAddressRequest() {
		return addressRequest;
	}

	public void setAddressRequest(AddressRequest addressRequest) {
		this.addressRequest = addressRequest;
	}

}