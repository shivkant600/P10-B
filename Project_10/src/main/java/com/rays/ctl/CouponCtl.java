package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CouponDTO;
import com.rays.form.CouponForm;
import com.rays.service.CouponServiceInt;

@RestController
@RequestMapping(value = "Coupon")
public class CouponCtl extends BaseCtl<CouponForm, CouponDTO, CouponServiceInt> {
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}
}
