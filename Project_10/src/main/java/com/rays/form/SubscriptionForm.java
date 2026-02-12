package com.rays.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SubscriptionDTO;

public class SubscriptionForm extends BaseForm {

	@NotEmpty(message = "please enter planName")
	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "planName must contain only letters")
	private String planName;

	@NotEmpty(message = "please enter planPrice")
	private String planPrice;

	@NotNull(message = "please enter startDate ")
	private LocalDate startDate;

	@NotNull(message = "please enter endDate ")
	private LocalDate endDate;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanPrice() {
		return planPrice;
	}

	public void setPlanPrice(String planPrice) {
		this.planPrice = planPrice;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		SubscriptionDTO dto = initDTO(new SubscriptionDTO());
		dto.setPlanName(planName);
		dto.setPlanPrice(planPrice);
		dto.setStartDate(startDate);
		dto.setEndDate(endDate);
		dto.setStatus(status);
		return dto;
	}

}
