package com.aatout.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="PROD")
public class Produit extends Bien implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Double stock;
	private Double stockAlert;
	
	public Double getStock() {
		return stock;
	}
	public void setStock(Double stock) {
		this.stock = stock;
	}
	public Double getStockAlert() {
		return stockAlert;
	}
	public void setStockAlert(Double stockAlert) {
		this.stockAlert = stockAlert;
	}
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String nom, String description, String photo, Double prix, Double tBCCV,
			List<Utilisateur> proprietaires, List<Facturer> facturers) {
		super(nom, description, photo, prix, tBCCV, proprietaires, facturers);
		// TODO Auto-generated constructor stub
	}
	public Produit(Double stock, Double stockAlert) {
		super();
		this.stock = stock;
		this.stockAlert = stockAlert;
	}
	
	
	
	
	
	
	
	
	
	
}
