package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CouponDAOInt;
import com.rays.dto.CouponDTO;


@Service
@Transactional
public class CouponServiceImpl extends BaseServiceImpl<CouponDTO, CouponDAOInt> implements CouponServiceInt {

}
