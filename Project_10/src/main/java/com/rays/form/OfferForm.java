package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OfferDTO;

public class OfferForm  extends BaseForm{
	
	@NotEmpty(message = "please enter offerCode")
	private String offerCode;
	
	@NotNull(message = "please enter discountAmount ")
	private Long discountAmount;
	
	
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

	public Long getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Long discountAmount) {
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
	OfferDTO dto = initDTO(new OfferDTO());
	
	
	   dto.setOfferCode(offerCode);
	   
	   dto.setDiscountAmount(discountAmount);
	   
	   dto.setExpireDate(expireDate);
	   
	   dto.setOfferStatus(offerStatus);
	   
		return dto;
	}
	
	
	
	

}
