package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Stock {
@Id
	private int ID_stock;
	private int Quantite_stock;
	@ManyToOne
	private ResponsableDeLaboratoire responsable_laboratoire;
	
}
