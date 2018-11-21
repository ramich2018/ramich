package com.aatout.dao;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aatout.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
	@Query("select c from Utilisateur c where c.nom like :x")
	public Page<Utilisateur> chercher(@Param("x")String mc,Pageable pageable);
}
