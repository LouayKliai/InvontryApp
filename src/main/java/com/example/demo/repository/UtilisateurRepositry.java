package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.AuditModel;
import com.example.demo.entity.Utilisateur;

public interface UtilisateurRepositry extends JpaRepository<Utilisateur, Integer> {

}
