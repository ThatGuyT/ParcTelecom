package com.banque.ParcTelecom.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Role {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long Id ;
	private String role;
}
