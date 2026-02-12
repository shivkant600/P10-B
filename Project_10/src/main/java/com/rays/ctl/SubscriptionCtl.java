package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.SubscriptionDTO;
import com.rays.form.SubscriptionForm;
import com.rays.service.SubscriptionServiceInt;
@RestController
@RequestMapping(value = "Subscription")
public class SubscriptionCtl extends BaseCtl<SubscriptionForm, SubscriptionDTO, SubscriptionServiceInt> {
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}
}
