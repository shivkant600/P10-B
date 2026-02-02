package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CouponDTO;

public class CouponForm extends BaseForm {
	@NotEmpty(message = "please enter offerCode")
	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "Name must contain only letters")
	private String offerCode;
	@NotEmpty(message = "please enter discountAmount")
	private String discountAmount;
	@NotNull(message = "please enter expireDate ")
	private Date expireDate;
	@NotEmpty(message = "please enter offerStatus")
	private String offerStatus;

	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	public String getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}
	
	
	@Override
	public BaseDTO getDto() {
		
		CouponDTO dto = initDTO(new CouponDTO());
		dto.setOfferCode(offerCode);
		dto.setDiscountAmount(discountAmount);
		dto.setExpireDate(expireDate);
		dto.setOfferStatus(offerStatus);
		return dto;
	}

}
