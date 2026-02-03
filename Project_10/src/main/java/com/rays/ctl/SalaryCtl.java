package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.SalaryDTO;
import com.rays.form.SalaryForm;
import com.rays.service.SalaryServiceInt;
@RestController
@RequestMapping(value="Salary")
public class SalaryCtl extends BaseCtl<SalaryForm, SalaryDTO, SalaryServiceInt>{
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}

}
