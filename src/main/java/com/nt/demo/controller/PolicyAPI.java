package com.nt.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.demo.dto.PolicyDto;
import com.nt.demo.dto.PolicyTypeDto;
import com.nt.demo.model.PolicyType;
import com.nt.demo.service.PolicyTypeService;

@RestController
@RequestMapping("/api/policyType")
public class PolicyAPI {
	@Autowired
	private PolicyTypeService service;

	@PostMapping()
	public PolicyType addPolicy(@RequestBody PolicyTypeDto policyTypeDto) {
		PolicyType typePolicy = service.addPolicyType(policyTypeDto);
		return typePolicy;

	}
//	@RequestMapping("/updatePolicy")
//	public Policy updatePolicy(@PathVaribale PolicyDto dto ) {
//		
//	}

}
