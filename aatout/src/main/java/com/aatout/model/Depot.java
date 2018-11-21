package com.aatout.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="DEPO")
public class Depot extends Operation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Depot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Depot(Date dateOp, Double montantOp, Compte compte) {
		super(dateOp, montantOp, compte);
		// TODO Auto-generated constructor stub
	}
	
	

}
