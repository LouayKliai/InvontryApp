package com.example.demo.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Administrateur  extends Utilisateurs{
	@OneToMany(mappedBy = "adminstrateur")
	private List<Categorie> list_categorie;
	@OneToMany(mappedBy  ="admin")
	private List<Gestion_des_comptes> list_gestion;
	//@Override
	void modifierProfile(Utilisateurs user) {
		// TODO Auto-generated method stub
		
	}
}
