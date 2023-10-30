package com.example.demo.entity;

import java.io.Serializable;

import org.hibernate.annotations.GeneratedColumn;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="categorie")
public class Categorie implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_categorie;
	private String Nom_categorie;
	private Photo Photo_categorie;
	@ManyToOne
	private ResponsableDeLaboratoire res_laboratoire;
	@ManyToOne
	private Administrateur adminstrateur;

}
