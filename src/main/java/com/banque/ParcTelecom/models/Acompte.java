package com.banque.ParcTelecom.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Acompte {


	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	@OneToMany(targetEntity = Facture.class)
	private List<Facture> numfacture;
	private int numacompte;
	private Date dateacompte;
	private int montant;
	private int acompteA;
	private int reste;
	
	public List<Facture> getNumfacture() {
		return numfacture;
	}
	public void setNumfacture(List<Facture> numfacture) {
		this.numfacture = numfacture;
	}
	public int getNumacompte() {
		return numacompte;
	}
	public void setNumacompte(int numacompte) {
		this.numacompte = numacompte;
	}
	public Date getDateacompte() {
		return dateacompte;
	}
	public void setDateacompte(Date dateacompte) {
		this.dateacompte = dateacompte;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	public int getAcompteA() {
		return acompteA;
	}
	public void setAcompteA(int acompteA) {
		this.acompteA = acompteA;
	}
	public int getReste() {
		return reste;
	}
	public void setReste(int reste) {
		this.reste = reste;
	}
	
}
