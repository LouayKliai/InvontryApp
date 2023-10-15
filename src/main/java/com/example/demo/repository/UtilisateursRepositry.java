package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Utilisateurs;

public interface UtilisateursRepositry extends JpaRepository<Utilisateurs, Integer> {

}
