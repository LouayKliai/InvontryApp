package com.example.demo.entity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produit {
@Id
	private int ID_produit;
	private String Nom_produit;
	private String Unitee_produit;
	private int Numero_inventaire;
	private int Contient_numero_inventaire;
	private int Stock_initial_total;
	private int Stock_sortant_total;
	private int Stock_en_cours_d_emprunt_total;
	private int Stock_disponible;
	private String Seuil;
	private String Detaille_produit;
	private int Quantitee_empruntee;
	@ManyToOne
	private ChefDeDepartement chef_Departement;
	@ManyToOne
	private ResponsableDeLaboratoire res;
	
	@OneToMany(mappedBy="produit")
	private List<Emprunt> list_emprunt;
}
