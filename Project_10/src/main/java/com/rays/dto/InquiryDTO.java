package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name= "ST_INQUIRY")
public class InquiryDTO extends BaseDTO{
	
	@Column(name = "inquirerName", length = 50)
	private String inquirerName;
	
	@Column(name = "email", length = 50)
	private String email;
	
	@Column(name = "inquirySubject", length = 50)
	private String inquirySubject;
	
	@Column(name = "inquiryStatus", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return inquirerName;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "inquirerName";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return inquirerName;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "inquirerName";
	}
	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("inquirerName", "asc");

		return map;	}
	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("inquirerName", inquirerName);
		return map;
	}

}
