package com.example.demo.service;

import com.example.demo.entity.Produit;
import com.example.demo.entity.Utilisateurs;

public interface UtilisateurService {

     boolean demanderEmprunt(int id);
     boolean consulterEtatProduit(Produit p);
     

}