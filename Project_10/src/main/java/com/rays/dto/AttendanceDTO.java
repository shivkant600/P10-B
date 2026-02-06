package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ATTENDANCE")
public class AttendanceDTO extends BaseDTO {
	@Column(name = "personName", length = 50)
	private String personName;

	@Column(name = "attendanceDate", length = 50)
	private Date attendanceDate;

	@Column(name = "attendanceStatus", length = 50)
	private String attendanceStatus;

	@Column(name = "remarks", length = 50)
	private String remarks;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Date getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(Date attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public String getAttendanceStatus() {
		return attendanceStatus;
	}

	public void setAttendanceStatus(String attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "personName";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "personName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return personName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "personName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("personName", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("personName", personName);
		return map;
	}

}
