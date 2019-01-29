package com.nt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
