package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class ChefDeDepartement extends AuditModel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@OneToMany(mappedBy="chef_Departement")
	private List<Produit> list_Produit;


}
