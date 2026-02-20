package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.AlertDAOInt;
import com.rays.dto.AlertDTO;
@Service
@Transactional
public class AlertServiceImpl extends BaseServiceImpl<AlertDTO, AlertDAOInt> implements AlertServiceint{

}
