package com.example.demo.service;

import com.example.demo.entity.Categorie;
import com.example.demo.entity.AuditModel;

public interface CommunMethod {
	AuditModel modifierProfile(AuditModel user);
	void  ajouterCategorie(Categorie categorie);
	void supprimerCategorie(Categorie categorie);
	Categorie modifierCategorie(Categorie categorie);
	   
       
       
       
}
