package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.service.ChefDeDepartementService;

public interface ChefDepartementRepositry extends JpaRepository<ChefDeDepartementService, Integer> {

}
