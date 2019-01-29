package com.nt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.demo.model.PolicyType;

public interface PolicyTypeRepository extends JpaRepository<PolicyType,Integer> {

}
