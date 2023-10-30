package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public class Gestion_des_comptes {
	@Id
	@Column(unique=true,nullable = false)
	private int ID_compte;
	@ManyToOne
	private Administrateur admin;

}
