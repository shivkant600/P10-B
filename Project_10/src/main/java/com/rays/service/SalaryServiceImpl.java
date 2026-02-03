package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SalaryDAOInt;
import com.rays.dto.SalaryDTO;
@Service
@Transactional
public class SalaryServiceImpl extends BaseServiceImpl<SalaryDTO, SalaryDAOInt> implements SalaryServiceInt{

}
