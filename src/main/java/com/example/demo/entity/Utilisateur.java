package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Utilisateur extends Utilisateurs{
	@OneToMany(mappedBy="user")
	private List<Emprunt> list_emprunt;
}
