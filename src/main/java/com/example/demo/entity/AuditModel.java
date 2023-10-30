package com.example.demo.entity;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class AuditModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	
	@Id
	@Column(unique=true,nullable = false)
	private int ID_utilisateur;
	private String Nom_utlisateur;
	@Column(unique=true,nullable=false)
	private String Email_utilisateur;
	private String Numero_utilisateur;
	private String Mot_de_passe;
	@Enumerated(EnumType.STRING)
	private Role role;
	private Photo photos;
}
	

