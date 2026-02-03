package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
@Entity
@Table(name="ST_SALARY")
public class SalaryDTO extends BaseDTO {
	@Column(name = "employee", length = 50)
	private String employee;
	@Column(name = "amount", length = 50)
	private String amount;
	@Column(name = "dob", length = 50)
	private Date dob;
	@Column(name = "status", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return employee;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "employee";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return employee;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "employee";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("employee", "asc");
		
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("employee", employee);
		return map;
	}

}
