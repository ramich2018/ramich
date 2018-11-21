package com.aatout.dao;


import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aatout.model.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long>{
	@Query("select c from Operation c where c.dateOp = :x")
	public Page<Operation> chercherDate(@Param("x")Date mc,Pageable pageable);
	
/*	@Query("select c from Operation c where c.monatantOp = :x")
	public Page<Operation> chercherMontant(@Param("x")Double mc,Pageable pageable);  */
}
