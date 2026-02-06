package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AttendanceDTO;
@Repository
public class AttendanceDAOImpl extends BaseDAOImpl<AttendanceDTO> implements AttendanceDAOInt {

	@Override
	protected List<Predicate> getWhereClause(AttendanceDTO dto, CriteriaBuilder builder, Root<AttendanceDTO> qRoot) {
List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getPersonName())) {

			whereCondition.add(builder.like(qRoot.get("personName"), dto.getPersonName() + "%"));
		}
		
	if (isNotNull(dto.getAttendanceDate())) {

			whereCondition.add(builder.equal(qRoot.get("attendanceDate"), dto.getAttendanceDate()));
		}
	
	
	if (!isEmptyString(dto.getAttendanceStatus())) {

		whereCondition.add(builder.like(qRoot.get("attendanceStatus"), dto.getAttendanceStatus() + "%"));
	}
	
		return whereCondition;
	}
		
	

	@Override
	public Class<AttendanceDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return AttendanceDTO.class;
	}

}
