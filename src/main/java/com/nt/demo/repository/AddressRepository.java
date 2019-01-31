/**
 * 
 */
package com.nt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.demo.model.Address;

/**
 * @author Rajashree
 *
 */
public interface AddressRepository extends JpaRepository<Address, Long> {

}
