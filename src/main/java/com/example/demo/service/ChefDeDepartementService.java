package com.example.demo.service;

import com.example.demo.entity.Utilisateurs;

public interface ChefDeDepartementService {
	Utilisateurs modifierProfile(Utilisateurs user);
	boolean acceptDemande();
	boolean refuseDemande();
	void generePDF();

}
