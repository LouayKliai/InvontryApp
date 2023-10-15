package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.service.AdministrateurService;

public interface AdmistrateurRepositry extends JpaRepository<AdministrateurService, Integer> {
     
}
