package com.aatout.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="ADMI")
public class Administrateur extends Utilisateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrateur(String nom, String prenom, Date dateNaissance, String email, long tel, String photo) {
		super(nom, prenom, dateNaissance, email, tel, photo);
		// TODO Auto-generated constructor stub
	}
	
}
