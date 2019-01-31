/**
 * 
 */
package com.nt.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.demo.dto.CustomerRequest;
import com.nt.demo.dto.CustomerUpdateRequest;
import com.nt.demo.model.Customer;

/**
 * @author Rajashree
 *
 */
@RestController
@RequestMapping("/api/customer")
public interface CustomerAPI {
	@PostMapping
	public ResponseEntity<Customer> storeCustomerDetails(@RequestBody CustomerRequest customerRequest);

	@GetMapping("/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable long id);

	@GetMapping("/{name}")
	public ResponseEntity<List<Customer>> searchCustomerByName(@PathVariable String name);

	@GetMapping
	public ResponseEntity<List<Customer>> viewCustomerDetails();

	@PutMapping
	public ResponseEntity<Customer> updateCustomerDetails(@RequestBody CustomerUpdateRequest updateRequest);

	@DeleteMapping("/{id}")
	public void deleteCustomerDetails(@PathVariable Long id);
}
