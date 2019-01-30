package com.nt.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.demo.dto.PolicyTypeDto;
import com.nt.demo.dto.PolicyTypeUpdateDto;
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

	public PolicyType getPolicyTypeById(int id) {
		PolicyType policyType = policyTypeRepository.getOne(id);
		return policyType;

	}

	public List<PolicyType> getAllPolicyType() {
		List<PolicyType> policyTypelist = policyTypeRepository.findAll();
		return policyTypelist;
	}

	public PolicyType updatePolicyType(PolicyTypeUpdateDto updateDto) {
		PolicyType policyType = policyTypeRepository.getOne(updateDto.getId());
		policyType.setActive(updateDto.isActive());
		PolicyType typePolicy = policyTypeRepository.save(policyType);
		return typePolicy;
	}

	public void deletePolicyType(int id) {
		PolicyType policyType = new PolicyType(id);
		policyTypeRepository.delete(policyType);
	}

}
