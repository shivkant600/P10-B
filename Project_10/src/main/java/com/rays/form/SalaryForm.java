package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SalaryDTO;

public class SalaryForm extends BaseForm {
	@NotEmpty(message = "please enter employee")
	private String employee;
	@NotEmpty(message = "please enter amount")
	private String amount;
	@NotNull(message = "please enter dob")
	private Date dob;
	@NotEmpty(message = "please enter status")
	private String status;

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		SalaryDTO dto = initDTO(new SalaryDTO());

		dto.setEmployee(employee);
		dto.setAmount(amount);
		dto.setDob(dob);
		dto.setStatus(status);
		return dto;
	}

}
