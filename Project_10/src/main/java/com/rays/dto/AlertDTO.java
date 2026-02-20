package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


import com.rays.common.BaseDTO;
@Entity
@Table(name = "ST_ALERT")
public class AlertDTO extends BaseDTO{
	
	@Column(name = "alertCode", length = 50)
	private String alertCode;
	
	@Column(name = "alertType", length = 50)
	private String alertType;
	
	@Column(name = "alertTime", length = 50)
	private Date alertTime;
	
	@Column(name = "alertStatus", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return "alertCode";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "alertCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return alertCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "alertCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("alertCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("alertCode", alertCode);
		return map;
	}

}
