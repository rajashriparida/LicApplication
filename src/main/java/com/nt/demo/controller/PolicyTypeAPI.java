package com.nt.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.demo.dto.PolicyTypeDto;
import com.nt.demo.dto.PolicyTypeUpdateDto;
import com.nt.demo.model.PolicyType;
import com.nt.demo.service.PolicyTypeService;

@RestController
@RequestMapping("/api/policyType")
public class PolicyTypeAPI {
	@Autowired
	private PolicyTypeService service;

	@PostMapping()
	public PolicyType addPolicyType(@RequestBody PolicyTypeDto policyTypeDto) {
		PolicyType typePolicy = service.addPolicyType(policyTypeDto);
		return typePolicy;

	}

	@GetMapping("/{id}")
	public PolicyType getPolicyTypeById(@PathVariable int id) {
		PolicyType policyType = service.getPolicyTypeById(id);
		return policyType;

	}

	@GetMapping
	public List<PolicyType> getAllPolicyType() {
		List<PolicyType> policyType = service.getAllPolicyType();
		return policyType;

	}

	@PutMapping
	public PolicyType updatePolicyType(@RequestBody PolicyTypeUpdateDto updateDto) {
		PolicyType policyType=service.updatePolicyType(updateDto);
		return policyType;

	}

	@DeleteMapping("/{id}")
	public void deletePolicyType(@PathVariable int id) {
		service.deletePolicyType(id);

	}
}
