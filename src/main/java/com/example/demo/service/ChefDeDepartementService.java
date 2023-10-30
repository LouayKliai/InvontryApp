package com.example.demo.service;

import com.example.demo.entity.AuditModel;

public interface ChefDeDepartementService {
	AuditModel modifierProfile(AuditModel user);
	boolean acceptDemande();
	boolean refuseDemande();
	void generePDF();

}
