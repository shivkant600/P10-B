package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.SessionDTO;
import com.rays.form.SessionForm;
import com.rays.service.SessionServiceInt;
@RestController
@RequestMapping(value = "Session")
public class SessionCtl  extends BaseCtl<SessionForm, SessionDTO, SessionServiceInt>{

}
