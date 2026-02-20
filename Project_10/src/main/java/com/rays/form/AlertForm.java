package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.AlertDTO;

public class AlertForm extends BaseForm{
	
	@NotEmpty(message = "please enter alertCode")
	
	private String alertCode;
	
	@NotEmpty(message = "please enter alertType")
	private String alertType;
	
	@NotNull(message = "please enter alertTime ")
	private Date alertTime;
	
	@NotEmpty(message = "please enter alertStatus")
	private String alertStatus;

	public String getAlertCode() {
		return alertCode;
	}

	public void setAlertCode(String alertCode) {
		this.alertCode = alertCode;
	}

	public String getAlertType() {
		return alertType;
	}

	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}

	public Date getAlertTime() {
		return alertTime;
	}

	public void setAlertTime(Date alertTime) {
		this.alertTime = alertTime;
	}

	public String getAlertStatus() {
		return alertStatus;
	}

	public void setAlertStatus(String alertStatus) {
		this.alertStatus = alertStatus;
	}
	
	
	@Override
	public BaseDTO getDto() {
		AlertDTO dto = initDTO(new AlertDTO());
		dto.setAlertCode(alertCode);
		dto.setAlertType(alertType);
		dto.setAlertTime(alertTime);
		dto.setAlertStatus(alertStatus);
		return dto;
	}

}
