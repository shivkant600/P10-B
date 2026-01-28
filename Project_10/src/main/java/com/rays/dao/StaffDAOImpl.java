package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.StaffDTO;
@Repository
public class StaffDAOImpl extends BaseDAOImpl<StaffDTO> implements StaffDAOInt{

	@Override
	protected List<Predicate> getWhereClause(StaffDTO dto, CriteriaBuilder builder, Root<StaffDTO> qRoot) {
		// TODO Auto-generated method stub
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getName())) {

			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}
		return whereCondition;
	}

	@Override
	public Class<StaffDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return StaffDTO.class;
	}

}
