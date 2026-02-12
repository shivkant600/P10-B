package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_OFFER")
public class OfferDTO extends BaseDTO {

	@Column(name = "OFFER_CODE")
	private String offerCode;

	@Column(name = "discountAmount")
	private Long discountAmount;

	@Column(name = "expireDate")
	private Date expireDate;

	@Column(name = "offerStatus")
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
	public String getValue() {
		return offerCode;
	}

	@Override
	public String getUniqueKey() {

		return "offerCode";
	}

	@Override
	public String getUniqueValue() {

		return offerCode;
	}

	@Override
	public String getLabel() {

		return "offerCode";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("offerCode", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("offerCode", offerCode);
		return map;
	}

}
