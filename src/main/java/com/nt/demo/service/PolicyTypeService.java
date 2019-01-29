package com.nt.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.demo.dto.PolicyDto;
import com.nt.demo.dto.PolicyTypeDto;
import com.nt.demo.model.Policy;
import com.nt.demo.model.PolicyType;
import com.nt.demo.repository.PolicyTypeRepository;

@Service
public class PolicyTypeService {
	@Autowired
	private PolicyTypeRepository policyTypeRepository;

	public PolicyType addPolicyType(PolicyTypeDto policyTypeDto) {
		PolicyType policyType = new PolicyType();
		policyType.setAmount(policyTypeDto.getAmount());
		policyType.setPName(policyTypeDto.getpName());
		policyType.setPolicyTerm(policyTypeDto.getPolicyTerm());
		PolicyType policy = policyTypeRepository.save(policyType);

		return policy;

	}

}
