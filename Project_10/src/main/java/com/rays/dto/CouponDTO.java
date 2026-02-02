package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;
@Entity
@Table(name="ST_COUPON")
public class CouponDTO extends BaseDTO {

	@Column(name = "OFFERCODE", length = 50)
	private String offerCode;
	@Column(name = "DISCOUNTAMOUNT", length = 50)
	private String discountAmount;
	@Column(name = "EXPIREDATE", length = 50)
	private Date expireDate;
	@Column(name = "OFFERSTATUS", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return "offerCode";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "offerCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return offerCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return offerCode;
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
