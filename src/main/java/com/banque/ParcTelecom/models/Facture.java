package com.banque.ParcTelecom.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;


@Entity
public class Facture {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private String numfacture;
	private Date datefacture;
	private String nom;
	private int montantf;
	@OneToMany(targetEntity = Contrat.class)
	private List<Contrat> numcontrat;
	@OneToMany(targetEntity = Prestataire.class)
	private List<Prestataire> numprestataire;
	
	
	public List<Contrat> getNumcontrat() {
		return numcontrat;
	}
	public void setNumcontrat(List<Contrat> numcontrat) {
		this.numcontrat = numcontrat;
	}
	public List<Prestataire> getNumprestataire() {
		return numprestataire;
	}
	public void setNumprestataire(List<Prestataire> numprestataire) {
		this.numprestataire = numprestataire;
	}

	public String getNumfacture() {
		return numfacture;
	}
	public void setNumfacture(String numfacture) {
		this.numfacture = numfacture;
	}
	public Date getDatefacture() {
		return datefacture;
	}
	public void setDatefacture(Date datefacture) {
		this.datefacture = datefacture;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getMontantf() {
		return montantf;
	}
	public void setMontantf(int montantf) {
		this.montantf = montantf;
	}
	
}
