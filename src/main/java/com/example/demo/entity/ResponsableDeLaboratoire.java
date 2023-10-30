package com.example.demo.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class ResponsableDeLaboratoire extends AuditModel {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@OneToMany
		private List<Produit> list_produit;
		@OneToMany(mappedBy="responsable_laboratoire")
		private List<Stock> list_stock;
		@OneToMany(mappedBy="res_laboratoire")
		private List<Categorie> list_categorie;
		
		}	

