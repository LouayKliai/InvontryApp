package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categorie {
@Id
	private int ID_categorie;
	private String Nom_categorie;
	private Photo Photo_categorie;
	@ManyToOne
	private ResponsableDeLaboratoire res_laboratoire;
	@ManyToOne
	private Administrateur adminstrateur;

}
