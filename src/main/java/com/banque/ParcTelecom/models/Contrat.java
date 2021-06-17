package com.banque.ParcTelecom.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Contrat {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private long numcontrat;
	private Date datedebut;
	private Date datefin;
	private String typedecharge;
	private String typef;
	@OneToMany(targetEntity = TypeMateriel.class)
	private List<TypeMateriel> typemateriel;
	private String designation;
	@OneToMany(targetEntity = Prestataire.class)
	private List<Prestataire> numprestataire;
	public long getNumcontrat() {
		return numcontrat;
	}
	public void setNumcontrat(long numcontrat) {
		this.numcontrat = numcontrat;
	}
	public Date getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}
	public Date getDatefin() {
		return datefin;
	}
	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	public String getTypedecharge() {
		return typedecharge;
	}
	public void setTypedecharge(String typedecharge) {
		this.typedecharge = typedecharge;
	}
	public String getTypef() {
		return typef;
	}
	public void setTypef(String typef) {
		this.typef = typef;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public List<TypeMateriel> getTypemateriel() {
		return typemateriel;
	}
	public void setTypemateriel(List<TypeMateriel> typemateriel) {
		this.typemateriel = typemateriel;
	}
	public List<Prestataire> getNumprestataire() {
		return numprestataire;
	}
	public void setNumprestataire(List<Prestataire> numprestataire) {
		this.numprestataire = numprestataire;
	}
	
}
