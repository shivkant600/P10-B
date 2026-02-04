package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.InquiryDTO;

public class InquiryForm extends BaseForm {
	
	@NotEmpty(message = "please enter inquirerName")
	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "Name must contain only letters")
	private String inquirerName;
	
	@NotEmpty(message = "please enter email")
	private String email;
	
	@NotEmpty(message = "please enter inquirySubject")
	private String inquirySubject;
	
	@NotEmpty(message = "please enter inquiryStatus")
	private String inquiryStatus;

	public String getInquirerName() {
		return inquirerName;
	}

	public void setInquirerName(String inquirerName) {
		this.inquirerName = inquirerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInquirySubject() {
		return inquirySubject;
	}

	public void setInquirySubject(String inquirySubject) {
		this.inquirySubject = inquirySubject;
	}

	public String getInquiryStatus() {
		return inquiryStatus;
	}

	public void setInquiryStatus(String inquiryStatus) {
		this.inquiryStatus = inquiryStatus;
	}
	
	
	@Override
	public BaseDTO getDto() {
		InquiryDTO dto = initDTO(new InquiryDTO());
		dto.setInquirerName(inquirerName);
		dto.setEmail(email);
		dto.setInquirySubject(inquirySubject);
		dto.setInquiryStatus(inquiryStatus);
		return dto;
	}
	
	

}
