package com.nt.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.demo.dto.PolicyDto;
import com.nt.demo.model.PolicyType;
import com.nt.demo.service.PolicyService;

@RestController
public class PolicyAPI {
	@Autowired
	private PolicyService service;
	@RequestMapping("/addPolicyType")
	public PolicyType addPolicy(@PathVariable  PolicyType policyType) {
	

	
		
	}
	@RequestMapping("/updatePolicy")
	public Policy updatePolicy(@PathVaribale PolicyDto dto ) {
		
	}

}
