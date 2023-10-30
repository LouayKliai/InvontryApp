package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.Categorie;
import com.example.demo.entity.AuditModel;

public interface AdministrateurService {
       AuditModel ajouterUtilisateur(AuditModel user);
       
       List<AuditModel> findAllUser();
       
}
