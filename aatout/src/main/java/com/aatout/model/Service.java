package com.aatout.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="SERV")
public class Service extends Bien implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service(String nom, String description, String photo, Double prix, Double tBCCV,
			List<Utilisateur> proprietaires, List<Facturer> facturers) {
		super(nom, description, photo, prix, tBCCV, proprietaires, facturers);
		// TODO Auto-generated constructor stub
	}
	
	
}
