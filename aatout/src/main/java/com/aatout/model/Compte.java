package com.aatout.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="T_COMPTE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE", discriminatorType=DiscriminatorType.STRING, length=4)
public abstract class Compte implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id 
	private String numCompte;
	private Date dateCreation;
	private Double credit;
	private Double debit;
	private Double provision; //Solde non touchable
	
	@ManyToOne
	private Utilisateur utilisateur;
	
	@OneToMany(mappedBy="compte")
	private List<Operation> operations =new ArrayList<>();

	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Double getCredit() {
		return credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Double getDebit() {
		return debit;
	}

	public void setDebit(Double debit) {
		this.debit = debit;
	}

	public Double getProvision() {
		return provision;
	}

	public void setProvision(Double provision) {
		this.provision = provision;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(String numCompte, Date dateCreation, Double credit, Double debit, Double provision,
			Utilisateur utilisateur, List<Operation> operations) {
		super();
		this.numCompte = numCompte;
		this.dateCreation = dateCreation;
		this.credit = credit;
		this.debit = debit;
		this.provision = provision;
		this.utilisateur = utilisateur;
		this.operations = operations;
	}
	
	
}
