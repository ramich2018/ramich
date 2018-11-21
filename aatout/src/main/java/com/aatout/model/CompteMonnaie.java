package com.aatout.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CPMN")
public class CompteMonnaie extends Compte implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CompteMonnaie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteMonnaie(String numCompte, Date dateCreation, Double credit, Double debit, Double provision,
			Utilisateur utilisateur, List<Operation> operations) {
		super(numCompte, dateCreation, credit, debit, provision, utilisateur, operations);
		// TODO Auto-generated constructor stub
	}
	
	

}
