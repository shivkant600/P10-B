package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OrderDTO;

public class OrderForm extends BaseForm {

	@NotEmpty(message = "please enter username")
	private String userName;

	@NotNull(message = "please enter totalamount")
	private Long totalAmount;

	@NotEmpty(message = "please enter status")
	private String status;
	
	@NotNull(message = "please enter dob")
	private Date orderDate;

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
	public BaseDTO getDto() {

		OrderDTO dto = initDTO(new OrderDTO());
		dto.setUserName(userName);
		dto.setTotalAmount(totalAmount);
		dto.setStatus(status);
		dto.setOrderDate(orderDate);

		return dto;
	}

}
