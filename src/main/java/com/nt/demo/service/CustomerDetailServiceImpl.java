/**
 * 
 */
package com.nt.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.demo.dto.CustomerRequest;
import com.nt.demo.dto.CustomerUpdateRequest;
import com.nt.demo.model.Address;
import com.nt.demo.model.Customer;
import com.nt.demo.repository.AddressRepository;
import com.nt.demo.repository.CustomerRepository;

/**
 * @author Rajashree
 *
 */
@Service
public class CustomerDetailServiceImpl implements CustomerDetailService {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Customer storeCustomerDetails(CustomerRequest customerRequest) {
		Address address = new Address(customerRequest.getAddressRequest().getPinCode(),
				customerRequest.getAddressRequest().getState(), customerRequest.getAddressRequest().getAddressDetails(),
				customerRequest.getAddressRequest().getTown(), customerRequest.getAddressRequest().getDist());
		Address addressDetails = addressRepository.save(address);

		Customer customer = new Customer(customerRequest.getCustomerName(), addressDetails.getId(),
				LocalDate.parse(customerRequest.getDob(),DateTimeFormatter.ofPattern("dd/MM/yyyy")), customerRequest.getGender(), customerRequest.getPhno(),
				customerRequest.getEmailId());

		return customerRepository.save(customer);

	}

	@Override
	public Customer getCustomerDetailsById(Long id) {
		return customerRepository.getOne(id);

	}

	@Override
	public List<Customer> searchCustomerByName(String name) {
		return customerRepository.findByCustomerName(name);

	}

	@Override
	public List<Customer> viewAllCustomerDetails() {
		return customerRepository.findAll();

	}

	@Override
	public Customer updateCustomerDetails(CustomerUpdateRequest updateRequest) {
		Address updateAddress = new Address(updateRequest.getAddressRequest().getPinCode(),
				updateRequest.getAddressRequest().getState(), updateRequest.getAddressRequest().getAddressDetails(),
				updateRequest.getAddressRequest().getTown(), updateRequest.getAddressRequest().getDist());
		Address address = addressRepository.save(updateAddress);
		Customer customer = customerRepository.getOne(updateRequest.getId());
		customer.setAddressId(address.getId());
		customer.setPhno(updateRequest.getPhno());
		return customerRepository.save(customer);

	}

	@Override
	public void deleteCustomerDetails(Long id) {
		Customer customer = new Customer(id);

		customerRepository.delete(customer);

	}

}
