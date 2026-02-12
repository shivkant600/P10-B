package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.OfferDAOint;
import com.rays.dto.OfferDTO;

@Service
@Transactional
public class OfferServiceImpl extends BaseServiceImpl<OfferDTO, OfferDAOint> implements OfferServiceInt {

}
