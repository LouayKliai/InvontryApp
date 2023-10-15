package com.example.demo.service;


import com.example.demo.entity.Emprunt;
import com.example.demo.entity.Produit;
import com.example.demo.entity.Stock;

public interface ResponsableDeLaboratoireService {
	
	void ajouterProduit(Produit produit);
	boolean supprimerProduit(Produit produit);
	boolean modifierProduit(Produit produit);
	boolean retirer_un_Stock(Stock stock);
	boolean ajouter_Stock(Stock stock);
	void genererPDF();
	boolean confirmeDemandeEmprunt(Emprunt emp);
	
}
