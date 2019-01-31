package com.nt.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.demo.dto.CustomerRequest;
import com.nt.demo.dto.CustomerUpdateRequest;
import com.nt.demo.model.Customer;
import com.nt.demo.service.CustomerDetailServiceImpl;
@RestController

public class CustomerAPIImpl implements CustomerAPI {
	@Autowired
	CustomerDetailServiceImpl service;

	@Override
	public ResponseEntity<Customer> storeCustomerDetails(CustomerRequest customerRequest) {
		Customer customer = service.storeCustomerDetails(customerRequest);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Customer> getCustomerById(long id) {
		Customer customer = service.getCustomerDetailsById(id);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Customer>> searchCustomerByName(String name) {
		List<Customer> customerlist = service.searchCustomerByName(name);
		return new ResponseEntity<>(customerlist, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Customer>> viewCustomerDetails() {
		List<Customer> customer=service.viewAllCustomerDetails();
		return new ResponseEntity<>(customer,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Customer> updateCustomerDetails(CustomerUpdateRequest updateRequest) {
		Customer customer=service.updateCustomerDetails(updateRequest);
		return new ResponseEntity<>(customer,HttpStatus.OK);
	}

	@Override
	public void deleteCustomerDetails(Long id) {
		service.deleteCustomerDetails(id);
		
	}

}
