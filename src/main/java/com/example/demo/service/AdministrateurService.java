package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.Categorie;
import com.example.demo.entity.Utilisateurs;

public interface AdministrateurService {
       boolean ajouterUtilisateur(Utilisateurs user);
       List<Utilisateurs> consulterListUtilisateur();
       boolean modifierProfil(Utilisateurs user);
       
}
