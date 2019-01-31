package com.nt.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.demo.dto.CustomerRequest;
import com.nt.demo.dto.CustomerUpdateRequest;
import com.nt.demo.model.Customer;

@Service
public interface CustomerDetailService {

	public Customer storeCustomerDetails(CustomerRequest customerRequest);

	public Customer getCustomerDetailsById(Long id);

	public List<Customer> searchCustomerByName(String name);

	public List<Customer> viewAllCustomerDetails();

	public Customer updateCustomerDetails(CustomerUpdateRequest updateRequest);

	public void deleteCustomerDetails(Long id);
}
