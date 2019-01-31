package com.nt.demo.dto;

import java.time.LocalDate;

public class PolicyDto {
	private LocalDate startDate;
	private LocalDate renewalDate;
	private LocalDate endDate;
	private LocalDate cancelDate;
	private int custId;
	private int policyTypeId;

	public PolicyDto() {
		super();
	}

	public PolicyDto(LocalDate startDate, LocalDate renewalDate, LocalDate endDate, LocalDate cancelDate, int custId,
			int policyTypeId) {
		super();
		this.startDate = startDate;
		this.renewalDate = renewalDate;
		this.endDate = endDate;
		this.cancelDate = cancelDate;
		this.custId = custId;
		this.policyTypeId = policyTypeId;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getRenewalDate() {
		return renewalDate;
	}

	public void setRenewalDate(LocalDate renewalDate) {
		this.renewalDate = renewalDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalDate getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(LocalDate cancelDate) {
		this.cancelDate = cancelDate;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getPolicyTypeId() {
		return policyTypeId;
	}

	public void setPolicyTypeId(int policyTypeId) {
		this.policyTypeId = policyTypeId;
	}

}
