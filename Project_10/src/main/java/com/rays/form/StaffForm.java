package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;

import com.rays.dto.StaffDTO;

public class StaffForm extends BaseForm {
	
	@NotEmpty(message = "please enter name")
	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "Name must contain only letters")
	private String name;
	
	
	@NotNull(message = "please enter joiningDate ")
	private Date joiningDate;
	
	@NotEmpty(message = "please enter division")
	private String division;
	
	@NotEmpty(message = "please enter previousEmployer")
	private String previousEmployer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getPreviousEmployer() {
		return previousEmployer;
	}
	public void setPreviousEmployer(String previousEmployer) {
		this.previousEmployer = previousEmployer;
	}
	
	
	@Override
	public BaseDTO getDto() {
		
		StaffDTO dto = initDTO(new StaffDTO());
		
		dto.setName(name);
		dto.setJoiningDate(joiningDate);
		dto.setDivision(division);
		dto.setPreviousEmployer(previousEmployer);
		return dto;
	}

}
