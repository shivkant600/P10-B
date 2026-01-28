package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PaymentDTO;

public class PaymentForm extends BaseForm {

	@NotEmpty(message = "please enter name")
	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "Name must contain only letters")
	private String name;

	@NotEmpty(message = "please enter amount")
	private String amount;

	@NotEmpty(message = "please enter paymentMode")
	private String paymentMode;

	@NotEmpty(message = "please enter paymentStatus")
	private String paymentStatus;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getPaymentMode() {
		return paymentMode;
	}


	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	@Override
	public BaseDTO getDto() {
	PaymentDTO dto =	initDTO(new PaymentDTO());
	
	dto.setName(name);
	dto.setAmount(amount);
	dto.setPaymentMode(paymentMode);
	dto.setPaymentStatus(paymentStatus);
		return dto;
	}

}
