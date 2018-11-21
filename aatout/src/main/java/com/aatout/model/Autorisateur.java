package com.aatout.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue(value="AUTO")
@Entity
public class Autorisateur extends Utilisateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Autorisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Autorisateur(String nom, String prenom, Date dateNaissance, String email, long tel, String photo) {
		super(nom, prenom, dateNaissance, email, tel, photo);
		// TODO Auto-generated constructor stub
	}
		
}
