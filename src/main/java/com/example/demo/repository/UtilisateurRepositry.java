package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.service.UtilisateurService;

public interface UtilisateurRepositry extends JpaRepository<com.example.demo.entity.Utilisateur, Integer> {

}
