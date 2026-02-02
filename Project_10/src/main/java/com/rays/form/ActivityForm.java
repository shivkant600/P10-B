package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ActivityDTO;

public class ActivityForm extends BaseForm {
	@NotEmpty(message = "please enter name")
	private String name;
	@NotEmpty(message = "please enter performedBy")
	private String performedBy;
	@NotNull(message = "please enter activityTime")
	private Date activityTime;
	@NotEmpty(message = "please enter status")
	private String status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPerformedBy() {
		return performedBy;
	}

	public void setPerformedBy(String performedBy) {
		this.performedBy = performedBy;
	}

	public Date getActivityTime() {
		return activityTime;
	}

	public void setActivityTime(Date activityTime) {
		this.activityTime = activityTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		ActivityDTO dto = initDTO(new ActivityDTO());
		dto.setName(name);
		dto.setPerformedBy(performedBy);
		dto.setActivityTime(activityTime);
		dto.setStatus(status);
		return dto;
	}

}
