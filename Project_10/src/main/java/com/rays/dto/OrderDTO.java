package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ORDER")
public class OrderDTO extends BaseDTO {
	@Column(name = "userName", length = 50)
	private String userName;
	@Column(name = "totalAmount", length = 50)
	private Long totalAmount;
	@Column(name = "status", length = 50)
	public String status;
	@Column(name = "orderDate", length = 50)
	public Date orderDate;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "userName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "userName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("userName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("userName", userName);
		return map;
	}

}
