package com.aatout.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="RETR")
public class Retrait extends Operation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retrait(Date dateOp, Double montantOp, Compte compte) {
		super(dateOp, montantOp, compte);
		// TODO Auto-generated constructor stub
	}
	
	

}
