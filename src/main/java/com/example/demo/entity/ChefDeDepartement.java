package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class ChefDeDepartement extends Utilisateurs{
@OneToMany(mappedBy="chef_Departement")
	private List<Produit> list_Produit;

@Override
void modifierProfile(Utilisateurs user) {
	// TODO Auto-generated method stub
	
}
}
