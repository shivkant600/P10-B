package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.OfferDTO;
import com.rays.form.OfferForm;
import com.rays.service.OfferServiceInt;

@RestController
@RequestMapping(value = "Offer")
public class OfferCtl extends BaseCtl<OfferForm, OfferDTO, OfferServiceInt> {
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}
}
