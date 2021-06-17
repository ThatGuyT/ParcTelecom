package com.banque.ParcTelecom.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Prestataire {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private int numprestataire;
	private String nomprestataire;
	private int telephone;
	private String contact;
	private int gsm;
	@OneToMany(targetEntity = Contrat.class)
	private List<Contrat> numcontrat;
	public int getNumprestataire() {
		return numprestataire;
	}
	public void setNumprestataire(int numprestataire) {
		this.numprestataire = numprestataire;
	}
	public String getNomprestataire() {
		return nomprestataire;
	}
	public void setNomprestataire(String nomprestataire) {
		this.nomprestataire = nomprestataire;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getGsm() {
		return gsm;
	}
	public void setGsm(int gsm) {
		this.gsm = gsm;
	}
	public List<Contrat> getNumcontrat() {
		return numcontrat;
	}
	public void setNumcontrat(List<Contrat> numcontrat) {
		this.numcontrat = numcontrat;
	}
}
