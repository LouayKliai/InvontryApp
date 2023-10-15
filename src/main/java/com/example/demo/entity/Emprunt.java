package com.example.demo.entity;

import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Emprunt {
@Id
	private int ID_emprunt;
private Date Date_de_Sortie;
private Date Date_de_retour;
private String Statut_emprunt;
@ManyToOneprivate Utilisateur user;
@ManyToOne
private Produit produit;

}
