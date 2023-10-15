package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.service.ResponsableDeLaboratoireService;

public interface ResponsableDeLaboratoireRepositry extends JpaRepository<ResponsableDeLaboratoireService, Integer> {

}
