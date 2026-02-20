package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AlertDTO;

@Repository
public class AlertDAOImpl extends BaseDAOImpl<AlertDTO> implements AlertDAOInt{

	@Override
	protected List<Predicate> getWhereClause(AlertDTO dto, CriteriaBuilder builder, Root<AlertDTO> qRoot) {
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getAlertCode())) {

			whereCondition.add(builder.like(qRoot.get("alertCode"), dto.getAlertCode() + "%"));
		}
		
	if (isNotNull(dto.getAlertTime())) {

			whereCondition.add(builder.equal(qRoot.get("alertTime"), dto.getAlertTime()));
		}
	
	
	if (!isEmptyString(dto.getAlertStatus())) {

		whereCondition.add(builder.like(qRoot.get("alertStatus"), dto.getAlertStatus() + "%"));
	}
	
		return whereCondition;
	}

	@Override
	public Class<AlertDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return AlertDTO.class;
	}
}
