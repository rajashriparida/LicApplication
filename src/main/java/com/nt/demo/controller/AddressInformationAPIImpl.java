/**
 * 
 */
package com.nt.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.nt.demo.dto.AddressRequest;
import com.nt.demo.model.Address;
import com.nt.demo.repository.AddressRepository;

/**
 * @author Rajashree
 *
 */

public class AddressInformationAPIImpl implements AddressInformationAPI {
	@Autowired
	AddressRepository addressRepository;

	@Override
	public ResponseEntity<Address> storeAddressInformation(AddressRequest addressRequest) {
		Address address = new Address(addressRequest.getPinCode(), addressRequest.getAddressDetails(),
				addressRequest.getDist(), addressRequest.getState(), addressRequest.getTown());
		addressRepository.save(address);
		return new ResponseEntity<>(address, HttpStatus.OK);

	}

}
