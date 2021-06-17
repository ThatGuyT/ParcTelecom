package com.banque.ParcTelecom.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class User {

	@Id
	private String username;
	private String password;
	private String email;
	private Boolean active;
	@OneToOne(targetEntity = Role.class)
	Role role;
}
