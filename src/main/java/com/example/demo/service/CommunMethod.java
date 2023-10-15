package com.example.demo.service;

import com.example.demo.entity.Categorie;
import com.example.demo.entity.Utilisateurs;

public interface CommunMethod {
	Utilisateurs modifierProfile(Utilisateurs user);
	void ajouterCategorie(Categorie categorie);
	boolean supprimerCategorie(Categorie categorie);
	boolean modifierCategorie(Categorie categorie);
	   
       
       
       
}
