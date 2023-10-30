package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Categorie;
import com.example.demo.repository.CategorieRepository;
@Service
public class CategorieServiceImpl implements CategorieService {

	@Autowired
	CategorieRepository catRep;
	@Override
	public void ajouterCategorie(Categorie categorie) {
		catRep.save(categorie);
	}


}
