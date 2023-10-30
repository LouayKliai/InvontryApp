package com.example.demo.entity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Utilisateur extends AuditModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="user")
	private List<Emprunt> list_emprunt;
}
