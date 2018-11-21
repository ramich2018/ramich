package com.aatout.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CPVL")
public class CompteValeur extends Compte implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CompteValeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteValeur(String numCompte, Date dateCreation, Double credit, Double debit, Double provision,
			Utilisateur utilisateur, List<Operation> operations) {
		super(numCompte, dateCreation, credit, debit, provision, utilisateur, operations);
		// TODO Auto-generated constructor stub
	}
	
	

}
