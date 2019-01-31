/**
 * 
 */
package com.nt.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.demo.model.Customer;

/**
 * @author Rajashree
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	public List<Customer> findByCustomerName(String name);

}
