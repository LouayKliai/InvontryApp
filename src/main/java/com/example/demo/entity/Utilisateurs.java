package com.example.demo.entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

@MappedSuperclass
public class Utilisateurs{
	@Id
	private int ID_utilisateur;
	private String Nom_utlisateur;
	private String Email_utilisateur;
	private String Numero_utilisateur;
	private String Mot_de_passe;
	private Role role;
	private Photo photos;
	void modifierProfile(Utilisateurs user) {};
	}


