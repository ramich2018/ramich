package com.aatout.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_FACTURE")
public class Facture implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateFacture;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateFacture() {
		return dateFacture;
	}
	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@OneToMany(mappedBy="facture")
	private List<Facturer> facturers=new ArrayList<>();
	
	
	public List<Facturer> getFacturers() {
		return facturers;
	}
	public void setFacturers(List<Facturer> facturers) {
		this.facturers = facturers;
	}
	
	
	
	
	
	
}
