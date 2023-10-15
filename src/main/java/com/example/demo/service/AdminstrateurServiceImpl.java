package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Categorie;
import com.example.demo.entity.Utilisateurs;
import com.example.demo.repository.AdmistrateurRepositry;
@Service
public class AdminstrateurServiceImpl implements AdministrateurService , CommunMethod {

	 	@Autowired
		private AdmistrateurRepositry admin;
	
	@Override
	public Utilisateurs modifierProfile(Utilisateurs user) {
		
		return null;
	}

	@Override
	public void ajouterCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean supprimerCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifierCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ajouterUtilisateur(Utilisateurs user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Utilisateurs> consulterListUtilisateur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifierProfil(Utilisateurs user) {
		// TODO Auto-generated method stub
		return false;
	}

}
