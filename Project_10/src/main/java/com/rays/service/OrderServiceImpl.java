package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.OfferDAOint;
import com.rays.dao.OrderDAOInt;
import com.rays.dto.OfferDTO;
import com.rays.dto.OrderDTO;
@Service
@Transactional
public class OrderServiceImpl extends BaseServiceImpl<OrderDTO, OrderDAOInt> implements OrderServiceInt {

}
