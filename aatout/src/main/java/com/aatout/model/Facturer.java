package com.aatout.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_FACTURER")
public class Facturer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private CleFacturer pkFacturer;
	private Double quantite;
	
	public CleFacturer getPkFacturer() {
		return pkFacturer;
	}
	public void setPkFacturer(CleFacturer pkFacturer) {
		this.pkFacturer = pkFacturer;
	}
	public Double getQuantite() {
		return quantite;
	}
	public void setQuantite(Double quantite) {
		this.quantite = quantite;
	}
	public Facturer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
 @ManyToOne
 private Facture facture;
 
 @ManyToOne
 private Bien bien;
 
 
public Facture getFacture() {
	return facture;
}
public void setFacture(Facture facture) {
	this.facture = facture;
}
public Bien getBien() {
	return bien;
}
public void setBien(Bien bien) {
	this.bien = bien;
}
 
 
 
 
 
}
