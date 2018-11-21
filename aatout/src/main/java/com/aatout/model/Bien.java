package com.aatout.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="T_BIEN")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="CAT", discriminatorType=DiscriminatorType.STRING, length=4)
public abstract class Bien implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nom;
	private String description;
	private String photo;
	private Double prix;
	private Double tBCCV;
	
	@ManyToMany(mappedBy="biens")
	private List<Utilisateur> proprietaires= new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Double gettBCCV() {
		return tBCCV;
	}

	public void settBCCV(Double tBCCV) {
		this.tBCCV = tBCCV;
	}

	public List<Utilisateur> getProprietaires() {
		return proprietaires;
	}

	public void setProprietaires(List<Utilisateur> proprietaires) {
		this.proprietaires = proprietaires;
	}

	public Bien() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Bien(String nom, String description, String photo, Double prix, Double tBCCV,
			List<Utilisateur> proprietaires, List<Facturer> facturers) {
		super();
		this.nom = nom;
		this.description = description;
		this.photo = photo;
		this.prix = prix;
		this.tBCCV = tBCCV;
		this.proprietaires = proprietaires;
		this.facturers = facturers;
	}



	@OneToMany(mappedBy="bien")
	private List<Facturer> facturers=new ArrayList<>();

	public List<Facturer> getFacturers() {
		return facturers;
	}

	public void setFacturers(List<Facturer> facturers) {
		this.facturers = facturers;
	}
	
}
