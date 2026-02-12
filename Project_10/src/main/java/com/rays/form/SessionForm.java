package com.rays.form;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SessionDTO;

public class SessionForm extends BaseForm{
	
	@NotEmpty(message = "please enter sessionName")
	
	private String sessionName;
	
	@NotNull(message = "please enter startTime ")
	private LocalDateTime startTime;
	
	
	@NotNull(message = "please enter endTime ")
	private LocalDateTime endTime;
	
	@NotEmpty(message = "please enter sessionStatus")
	private String sessionStatus;
	
	
	public String getSessionName() {
		return sessionName;
	}
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public String getSessionStatus() {
		return sessionStatus;
	}
	public void setSessionStatus(String sessionStatus) {
		this.sessionStatus = sessionStatus;
	}
	
	@Override
	public BaseDTO getDto() {
	SessionDTO dto = initDTO(new SessionDTO());
	dto.setSessionName(sessionName);
	dto.setStartTime(startTime);
	dto.setEndTime(endTime);
	dto.setSessionStatus(sessionStatus);
	
		return dto;
	}

}
