package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AuditModel;
import com.example.demo.entity.Categorie;
import com.example.demo.repository.AdmistrateurRepositry;
import com.example.demo.repository.AuditModelRepositry;
import com.example.demo.repository.CategorieRepository;
import com.example.demo.repository.UtilisateurRepositry;
@Service
public class AdminstrateurServiceImpl implements AdministrateurService , CommunMethod {
	@Autowired
	AdmistrateurRepositry adminRepo;
	@Autowired
	AuditModelRepositry auditRepo;
	@Autowired
	CategorieRepository catRepo;
	@Autowired
	UtilisateurRepositry utilisateurRep;

	

	@Override
	public void ajouterCategorie(Categorie categorie) {
		catRepo.save(categorie);
	}

	@Override
	public void supprimerCategorie(Categorie categorie) {
		catRepo.delete(categorie);
		
	}

	@Override
	public Categorie modifierCategorie(Categorie categorie) {
		return catRepo.saveAndFlush(categorie);
	}

	@Override
	public AuditModel ajouterUtilisateur(AuditModel user) {
		return auditRepo.save(user);
	}
	@Override
	public List<AuditModel> findAllUser() {
		return auditRepo.findAll();
	}

	@Override
	public AuditModel modifierProfile(AuditModel user) {
		return auditRepo.save(user);
	}
	
	
}
