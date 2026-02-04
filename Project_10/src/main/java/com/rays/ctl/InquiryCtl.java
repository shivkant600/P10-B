package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.InquiryDTO;
import com.rays.form.InquiryForm;
import com.rays.service.inquiryServiceInt;

@RestController
@RequestMapping(value = "Inquiry")
public class InquiryCtl extends BaseCtl<InquiryForm, InquiryDTO, inquiryServiceInt> {
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}

}
