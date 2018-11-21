package com.aatout.dao;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aatout.model.Compte;




public interface CompteRepository extends JpaRepository<Compte, String>{
	@Query("select c from Compte c where c.dateCreation = :x")
	public Page<Compte> chercherDate(@Param("x")Date mc,Pageable pageable);
}
