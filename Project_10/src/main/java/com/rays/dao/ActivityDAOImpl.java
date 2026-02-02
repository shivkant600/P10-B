package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ActivityDTO;

@Repository
public class ActivityDAOImpl extends BaseDAOImpl<ActivityDTO> implements ActivityDAOInt{

	@Override
	protected List<Predicate> getWhereClause(ActivityDTO dto, CriteriaBuilder builder, Root<ActivityDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getName())) {

			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}

		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		
		return whereCondition;
	}

	@Override
	public Class<ActivityDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return ActivityDTO.class;
	}

}
