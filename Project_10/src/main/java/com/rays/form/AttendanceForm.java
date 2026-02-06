package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.AttendanceDTO;

public class AttendanceForm extends BaseForm {
	@NotEmpty(message = "please enter personName")
	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "Name must contain only letters")
	private String personName;

	@NotNull(message = "please enter attendanceDate ")
	private Date attendanceDate;

	@NotEmpty(message = "please enter attendanceStatus")
	private String attendanceStatus;

	@NotEmpty(message = "please enter remarks")
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
	public BaseDTO getDto() {
		AttendanceDTO dto = initDTO(new AttendanceDTO());
		dto.setPersonName(personName);
		dto.setAttendanceDate(attendanceDate);
		dto.setAttendanceStatus(attendanceStatus);
		dto.setRemarks(remarks);
		return dto;
	}

}
