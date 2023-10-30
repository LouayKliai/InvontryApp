package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Categorie;

@Service
public interface CategorieService  {
	void ajouterCategorie(Categorie categorie);

}
