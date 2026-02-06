package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.AttendanceDTO;
import com.rays.form.AttendanceForm;
import com.rays.service.AttendanceServiceInt;
@RestController
@RequestMapping(value = "Attendance")
public class AttendanceCtl extends BaseCtl<AttendanceForm, AttendanceDTO, AttendanceServiceInt> {
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		return res;
	}
}
