package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SessionDAOInt;
import com.rays.dto.SessionDTO;
@Service
@Transactional
public class SessionServiceImpl  extends BaseServiceImpl<SessionDTO, SessionDAOInt> implements SessionServiceInt{

}
