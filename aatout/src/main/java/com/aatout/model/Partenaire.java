package com.aatout.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="PART")
public class Partenaire extends Utilisateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Partenaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Partenaire(String nom, String prenom, Date dateNaissance, String email, long tel, String photo) {
		super(nom, prenom, dateNaissance, email, tel, photo);
		// TODO Auto-generated constructor stub
	}
		
}
