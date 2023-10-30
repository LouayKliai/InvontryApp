package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Emprunt;

public interface EmpruntRepository extends JpaRepository<Emprunt, Integer> {

}
