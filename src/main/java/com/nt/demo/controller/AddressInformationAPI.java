package com.nt.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.demo.dto.AddressRequest;
import com.nt.demo.model.Address;

@RestController
@RequestMapping("/api/address")
public interface AddressInformationAPI {
	@PostMapping
	public ResponseEntity<Address> storeAddressInformation(@RequestBody AddressRequest addressRequest);
	

}
