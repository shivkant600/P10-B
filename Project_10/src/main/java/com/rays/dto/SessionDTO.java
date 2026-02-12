package com.rays.dto;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;
@Entity
@Table(name = "ST_SESSION")
public class SessionDTO extends BaseDTO {
	@Column(name = "sessionName", length = 50)
	private String sessionName;
	
	@Column(name = "startTime", length = 50)
	private LocalDateTime startTime;
	
	@Column(name = "endTime", length = 50)
	private LocalDateTime endTime;
	
	@Column(name = "sessionStatus", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return sessionName;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "sessionName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return sessionName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "sessionName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("sessionName", "asc");

		return map;	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("sessionName", sessionName);
		return map;
	}

}
