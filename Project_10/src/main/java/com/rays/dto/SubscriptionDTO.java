package com.rays.dto;

import java.time.LocalDate;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_SUBSCRIPTION")
public class SubscriptionDTO extends BaseDTO {
	
	
	@Column(name = "planName", length = 50)
	private String planName;
	
	@Column(name = "planPrice", length = 50)
	private String planPrice;
	
	@Column(name = "startDate", length = 50)
	private LocalDate startDate;
	
	
	@Column(name = "endDate", length = 50)
	private LocalDate endDate;
	
	
	@Column(name = "status", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return planName;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "planName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return planName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "planName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("planName", "asc");

		return map;	}
	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("planName", planName);
		return map;
	}

}
