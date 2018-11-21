package com.aatout.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CleFacturer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String codeFacture;
	private String codeProduit;
	public String getCodeFacture() {
		return codeFacture;
	}
	public void setCodeFacture(String codeFacture) {
		this.codeFacture = codeFacture;
	}
	public String getCodeProduit() {
		return codeProduit;
	}
	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}
	public CleFacturer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
