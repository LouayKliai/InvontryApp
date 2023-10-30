package com.example.demo.service;

import com.example.demo.entity.Produit;
import com.example.demo.entity.AuditModel;

public interface UtilisateurService {
     boolean modifierProfil(AuditModel user);
     boolean demanderEmprunt(int id);
     boolean consulterEtatProduit(Produit p);
     

}
