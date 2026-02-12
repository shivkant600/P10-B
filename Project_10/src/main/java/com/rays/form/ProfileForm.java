package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ProfileDTO;

public class ProfileForm extends BaseForm {

	@NotEmpty(message = "please enter fullName")
	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "Name must contain only letters")
	private String fullName;

	@NotEmpty(message = "please enter gender")
	private String gender;

	@NotNull(message = "please enter  dateOFbirth")
	private Date dateOFbirth;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOFbirth() {
		return dateOFbirth;
	}

	public void setDateOFbirth(Date dateOFbirth) {
		this.dateOFbirth = dateOFbirth;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		ProfileDTO dto = initDTO(new ProfileDTO());
		dto.setFullName(fullName);
		dto.setGender(gender);
		dto.setDateOFbirth(dateOFbirth);
		dto.setStatus(status);
		return dto;
	}

}
