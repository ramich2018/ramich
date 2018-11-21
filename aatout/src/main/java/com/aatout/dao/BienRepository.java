package com.aatout.dao;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aatout.model.Bien;

public interface BienRepository extends JpaRepository<Bien, Long>{
	@Query("select c from Bien c where c.nom like :x")
	public Page<Bien> chercher(@Param("x")String mc,Pageable pageable);
}
