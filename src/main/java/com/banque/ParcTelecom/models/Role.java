package com.banque.ParcTelecom.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private String role;
}