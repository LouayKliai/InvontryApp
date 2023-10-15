package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;

@Entity
public class ResponsableDeLaboratoire extends Utilisateurs {
		@OneToMany
		private List<Produit> list_produit;
		@OneToMany(mappedBy="responsable_laboratoire")
		private List<Stock> list_stock;
		@OneToMany(mappedBy="res_laboratoire")
		private List<Categorie> list_categorie;
		@Override
		void modifierProfile(Utilisateurs user) {
			// TODO Auto-generated method stub
			
		}
		
		}	

